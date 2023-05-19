package az.ingress.magicofspringboot.v3_1.v3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class MagicOfSpringBootApplication {

  public static void main(String[] args) {
    GenericApplicationContext context1 = new GenericApplicationContext();
    context1.registerBean(Student.class);
    context1.refresh();

    System.out.println("context 1");
    Student student1 = context1.getBean(
        Student.class);
    Student student2 = context1.getBean(
        Student.class);
    System.out.println(student1);
    System.out.println(student2);


  }

}
