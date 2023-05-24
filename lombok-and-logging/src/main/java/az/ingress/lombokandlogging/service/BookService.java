package az.ingress.lombokandlogging.service;

import az.ingress.lombokandlogging.entity.Book;
import az.ingress.lombokandlogging.model.BookFilterModel;
import az.ingress.lombokandlogging.model.request.BookRequestModel;
import az.ingress.lombokandlogging.model.response.BookResponseModel;
import java.util.List;

public interface BookService {
  void create(BookRequestModel book);
  void update(BookRequestModel book);
  void delete(Long id);
  List<BookResponseModel> getAll(BookFilterModel filter);
  BookResponseModel getById(Long id);
}
