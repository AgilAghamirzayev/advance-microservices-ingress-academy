package az.ingress.lombokandlogging.controller;

import az.ingress.lombokandlogging.entity.Book;
import az.ingress.lombokandlogging.model.BookFilterModel;
import az.ingress.lombokandlogging.model.request.BookRequestModel;
import az.ingress.lombokandlogging.model.response.BookResponseModel;
import az.ingress.lombokandlogging.service.BookService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/books")
public class BookController {

  private final BookService bookService;

  @GetMapping
  public List<BookResponseModel> getBooks(@RequestParam BookFilterModel filter) {
    return bookService.getAll(filter);
  }

  @GetMapping("/{id}")
  public BookResponseModel getBookById(@PathVariable Long id) {
    return bookService.getById(id);
  }

  @PostMapping
  public void addBook(@RequestBody BookRequestModel book) {
    bookService.create(book);
  }

  @PutMapping
  public void updateBook(@RequestBody BookRequestModel book) {
    bookService.update(book);
  }

  @DeleteMapping("/{id}")
  public void deleteBook(@PathVariable Long id) {
    bookService.delete(id);
  }



}
