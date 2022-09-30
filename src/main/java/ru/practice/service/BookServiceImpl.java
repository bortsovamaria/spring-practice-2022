package ru.practice.service;

import org.springframework.stereotype.Service;
import ru.practice.dao.BookDao;
import ru.practice.domain.Book;

import javax.annotation.Nonnull;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Nonnull
    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Nonnull
    @Override
    public Book getById(int id) {
        return bookDao.findById(id);
    }

    @Override
    public int create(@Nonnull Book book) {
        return bookDao.create(book);
    }

    @Nonnull
    @Override
    public Book update(int id, @Nonnull Book book) {
        Book byId = bookDao.findById(id);
        return bookDao.update(byId);
    }

    @Override
    public void delete(int id) {
        bookDao.delete(id);
    }
}
