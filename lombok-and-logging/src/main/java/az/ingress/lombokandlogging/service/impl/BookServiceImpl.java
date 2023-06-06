package az.ingress.lombokandlogging.service.impl;

import az.ingress.lombokandlogging.entity.Author;
import az.ingress.lombokandlogging.entity.Book;
import az.ingress.lombokandlogging.mapper.BookMapper;
import az.ingress.lombokandlogging.model.BookFilterModel;
import az.ingress.lombokandlogging.model.request.BookRequestModel;
import az.ingress.lombokandlogging.model.response.BookResponseModel;
import az.ingress.lombokandlogging.service.BookService;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class BookServiceImpl implements BookService {

//    BookMapper bookMapper = BookMapper.INSTANCE;

    List<Book> books = new ArrayList<>(100);


    @Override
    public void create(BookRequestModel book) {
        log.info("create().start book name: {}", book.getName());

        log.info("create().end book name: {}", book.getName());
    }

    @Override
    public void update(BookRequestModel book) {
        log.info("update().start book name: {}", book.getName());

        log.info("update().end book name: {}", book.getName());
    }

    @Override
    public void delete(Long id) {
        log.info("delete().start book id: {}", id);

        log.info("delete().end book id: {}", id);
    }

    @Override
    public List<BookResponseModel> getAll(BookFilterModel filter) {
        log.info("getAll().start book name: {}", filter.getName());

        log.info("getAll().end book name: {}", filter.getName());

        return null;
    }

    @Override
    public BookResponseModel getById(Long id) {
        log.info("getById().start book id: {}", id);

        log.info("getById().end book id: {}", id);
        return null;
    }
}
