package first.micronaut.repository;

import first.micronaut.domain.Author;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findByLastName(String lastName);

    @Join(value = "articles", type = Join.Type.LEFT_FETCH)
    List<Author> list();
}

