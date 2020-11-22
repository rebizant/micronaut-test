package first.micronaut;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleControllerTest {

    @Inject
    @Client("/")
    RxHttpClient client;


    public void testIndex() throws Exception {
        assertEquals(HttpStatus.OK, client.toBlocking().exchange("/sampleController").status());
    }
}
