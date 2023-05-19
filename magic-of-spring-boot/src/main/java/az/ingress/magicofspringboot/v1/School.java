package az.ingress.magicofspringboot.v1;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class School {

  public School() {
    System.out.println("School constructor called");
  }
}
