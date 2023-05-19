package az.ingress.lombokandlogging;

import az.ingress.lombokandlogging.service.AuthorService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class LombokAndLoggingApplication {

	private final AuthorService authorService;

	public static void main(String[] args) {
		SpringApplication.run(LombokAndLoggingApplication.class, args);
	}

	@PostConstruct
	public void run() {
		authorService.createAuthor();
		authorService.logLevels();
	}
}
