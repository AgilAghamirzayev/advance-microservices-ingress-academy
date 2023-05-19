package az.ingress.magicofspringboot.v4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagicOfSpringBootApplication {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(MagicOfSpringBootApplication.class);
    // configure
    // application.run(args);

    SpringApplication.run(MagicOfSpringBootApplication.class, args);

  }

}
