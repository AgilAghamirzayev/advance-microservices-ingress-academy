package az.ingress.magicofspringboot.v2;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Student {
  private final School school;

  public Student(School school) {
    System.out.println("Student controller called: " + school);
    this.school = school;
  }

  @Lookup
  School createSchoolObject() {
    return null;
  }

  public School getSchool() {
    return createSchoolObject();
  }
}
