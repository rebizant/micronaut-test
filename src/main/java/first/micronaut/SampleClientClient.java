package first.micronaut;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("sampleClient")
public interface SampleClientClient {

    @Get("/")
    public HttpStatus index();
}
