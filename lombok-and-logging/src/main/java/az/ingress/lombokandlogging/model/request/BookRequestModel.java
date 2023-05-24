package az.ingress.lombokandlogging.model.request;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequestModel {

  private String name;
  private String title;
  private String description;
  private List<AuthorRequestModel> authors;
  private LocalDate published;
}
