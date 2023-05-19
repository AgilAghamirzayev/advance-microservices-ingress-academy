package az.ingress.magicofspringboot.v3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MagicOfSpringBootApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context1 =
        new AnnotationConfigApplicationContext(MagicOfSpringBootApplication.class);

    System.out.println("context 1");
    Student student1 = context1.getBean(Student.class);
    Student student2 = context1.getBean(Student.class);
    System.out.println(student1);
    System.out.println(student2);

    AnnotationConfigApplicationContext context2 =
        new AnnotationConfigApplicationContext(Student.class);

    System.out.println("context 2");
    Student student3 = context2.getBean(Student.class);
    Student student4 = context2.getBean(Student.class);
    System.out.println(student3);
    System.out.println(student4);
  }

}
