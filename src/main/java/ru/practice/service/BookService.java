package ru.practice.service;

import ru.practice.domain.Book;

import javax.annotation.Nonnull;
import java.util.List;

public interface BookService {

    @Nonnull
    List<Book> findAll();

    @Nonnull
    Book getById(int id);

    int create(@Nonnull Book book);

    @Nonnull
    Book update(int id, @Nonnull Book book);

    void delete(int id);
}
