package az.ingress.lombokandlogging.service;

import az.ingress.lombokandlogging.entity.Author;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class AuthorService {



    public void logLevels() {
        log.info("INFO Message");
        log.warn("WARN Message");
        log.error("ERROR Message");
        log.debug("DEBUG Message");
        log.trace("TRACE Message");
    }

    public void createAuthor() {
        log.info("createAuthor.start Creating Author");

        Author author = Author.builder()
                .id(1)
                .surname("Aliyev")
                .name("Ali")
                .build();

        log.info("createAuthor.end Created Author: {} ", author);
    }

}
