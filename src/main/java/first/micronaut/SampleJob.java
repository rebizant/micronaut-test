package first.micronaut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Singleton
public class SampleJob {

    private static final Logger log = LoggerFactory.getLogger(SampleJob.class);

    //     @Scheduled(fixedRate = "5m")
    public void process() {

        log.info("Job executed");

    }
}
