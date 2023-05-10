package az.ingress.magicofspringboot.v4;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class StudentController {

  private final Student student;

  public StudentController(Student student) {
    System.out.println("StudentController constructor");
    this.student = student;
  }

  @RequestMapping("/student")
  public void getStudentName(HttpServletResponse response) throws IOException {
    response.getWriter().write("Student name: " + student.getName() + "\n");
    student.setName("Vali");
    response.getWriter().write("Student name: " + student.getName());
  }

  @RequestMapping("/student-1")
  public void getStudentName2(HttpServletResponse response) throws IOException {
    response.getWriter().write("Student name: " + student.getName());
  }


}
