package first.micronaut;

import io.micronaut.runtime.EmbeddedApplication;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

public class FirstMicronautTest {

    @Inject
    EmbeddedApplication application;

    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

}
