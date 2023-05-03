package s.good;

import java.util.List;
import java.util.Objects;
import s.Employee;

public class DataPersist {
  public void persistTheData(List<String> data) {
    Employee ali = new Employee(100, "Ali");
    ali.random = 1111;
    Objects json;
  }
}
