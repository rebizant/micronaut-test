package first.micronaut;

import first.micronaut.domain.Article;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import java.util.List;

@Controller("/api")
public class ArticleController {

    private final SampleService sampleService;

    public ArticleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @Get("/{author}/articles")
    public List<Article> getAllArticlesByAuthor(@PathVariable("author") String authorLastName) {
        return sampleService.getArticlesByAuthorLastName(authorLastName);
    }
}
