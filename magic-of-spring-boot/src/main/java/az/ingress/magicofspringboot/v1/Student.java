package az.ingress.magicofspringboot.v1;

import org.springframework.stereotype.Component;

@Component
public class Student {
  private final School school;

  public Student(School school) {
    System.out.println("Student controller called: " + school);
    this.school = school;
  }

  public School getSchool() {
    return school;
  }
}
