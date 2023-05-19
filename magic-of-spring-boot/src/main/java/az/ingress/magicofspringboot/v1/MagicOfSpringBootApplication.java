package az.ingress.magicofspringboot.v1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MagicOfSpringBootApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MagicOfSpringBootApplication.class);
    Student student = context.getBean("student", Student.class);
    Student student2 = context.getBean("student", Student.class);
    System.out.println(student.getSchool());
    System.out.println(student.getSchool());
    System.out.println(student2.getSchool());


  }

}
