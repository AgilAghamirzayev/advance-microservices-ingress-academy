package az.ingress.magicofspringboot.v4;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {

  private final Student student;

  public StudentController(Student student) {
    System.out.println("StudentController constructor");
    this.student = student;
  }

  @GetMapping
  public String getStudentName() {
    return "Test";
  }



}
