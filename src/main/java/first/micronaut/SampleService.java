package first.micronaut;

import first.micronaut.domain.Article;
import first.micronaut.domain.Author;
import first.micronaut.repository.ArticleRepository;
import first.micronaut.repository.AuthorRepository;
import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Value;
import io.micronaut.core.util.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Context
// @Singleton
public class SampleService {

    private static final Logger log = LoggerFactory.getLogger(SampleService.class);

    private final ArticleRepository articleRepository;
    private final AuthorRepository authorRepository;
    @Value("${database.host}")
    private String databaseHost;
    @Value("${database.port}")
    private String databasePort;

    public SampleService(ArticleRepository articleRepository, AuthorRepository authorRepository) {
        this.articleRepository = articleRepository;
        this.authorRepository = authorRepository;
    }

    public String getSampleData() {
        return "sample data";
    }

    @PostConstruct
    public void init() {
        log.info("database : {}:{}", databaseHost, databasePort);

        log.info("all articles quantity : {}", articleRepository.findAll().size());
    }

    public List<Article> getArticlesByAuthorLastName(String lastName) {

        List<Author> authors = authorRepository.findByLastName(lastName);
        if (CollectionUtils.isEmpty(authors)) {
            return Collections.emptyList();
        }

        Author author = authors.get(0);
        return articleRepository.findByAuthor(author);
    }

}
