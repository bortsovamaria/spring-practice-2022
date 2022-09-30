package ru.practice.dao;

import org.springframework.data.repository.NoRepositoryBean;
import ru.practice.domain.Book;

@NoRepositoryBean
public interface BookDao extends CrudOperations<Book, Integer> {
}
