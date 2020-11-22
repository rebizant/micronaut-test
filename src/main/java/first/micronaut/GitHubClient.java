package first.micronaut;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client
public interface GitHubClient {

    @Get("users/rebizant/repos")
    public GitHubDto getData();
}
