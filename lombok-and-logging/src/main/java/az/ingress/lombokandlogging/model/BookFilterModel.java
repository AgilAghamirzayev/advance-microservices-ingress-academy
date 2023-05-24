package az.ingress.lombokandlogging.model;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookFilterModel {
  private String name;
  private String authorName;
  private LocalDate published;
  private String title;
}
