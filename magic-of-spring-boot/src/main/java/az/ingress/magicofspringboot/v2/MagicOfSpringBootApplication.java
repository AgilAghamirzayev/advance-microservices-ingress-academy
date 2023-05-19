package az.ingress.magicofspringboot.v2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MagicOfSpringBootApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MagicOfSpringBootApplication.class);
    Student student = context.getBean("student", Student.class);
    System.out.println(student.getSchool().getName());
    System.out.println(student.getSchool().getName());

  }

}
