package first.micronaut.repository;

import first.micronaut.domain.Article;
import first.micronaut.domain.Author;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findByAuthor(Author author);
}
