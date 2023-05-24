package az.ingress.lombokandlogging.entity;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

  private Long id;
  private String name;
  private String title;
  private String description;
  private List<Author> authors;
  private LocalDate published;
  private LocalDate created;
  private Boolean isDeleted;
}
