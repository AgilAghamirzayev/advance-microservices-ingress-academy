package az.ingress.magicofspringboot.v2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
@Scope(value = "prototype")
public class School {

  private String name;

  public School() {
    System.out.println("School constructor called");
  }

  public String getName() {
    return name;
  }
}
