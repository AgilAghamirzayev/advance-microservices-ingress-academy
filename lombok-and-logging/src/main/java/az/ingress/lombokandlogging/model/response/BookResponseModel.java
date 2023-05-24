package az.ingress.lombokandlogging.model.response;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponseModel {

  private Long id;
  private String name;
  private String title;
  private String description;
  private List<AuthorResponseModel> authors;
  private LocalDate published;
  private LocalDate created;
}
