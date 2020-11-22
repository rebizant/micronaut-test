package first.micronaut.repository;

import first.micronaut.domain.Author;
import io.micronaut.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findByLastName(String lastName);
}
