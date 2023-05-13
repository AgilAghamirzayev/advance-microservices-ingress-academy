package az.ingress.magicofspringboot.v4;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
//@Scope(value = "prototype")
//@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@RequestScope
public class Student {

  public Student() {
    System.out.println("Student constructor");
  }

  private String name = "Ali";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
