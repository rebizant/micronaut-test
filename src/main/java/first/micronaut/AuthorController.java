package first.micronaut;

import first.micronaut.domain.Author;
import first.micronaut.repository.AuthorRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/api/authors")
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Get
    public List<Author> getAllAuthors() {
        return authorRepository.list();
    }
}
