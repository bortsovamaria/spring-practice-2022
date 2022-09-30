package ru.practice.dao;

import ru.practice.domain.Book;
import lombok.NonNull;
import org.springframework.stereotype.Repository;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Nullable
    @Override
    public Book findById(@NonNull Integer id) {
        return entityManager.find(Book.class, id);
    }

    @Nonnull
    @Override
    public List<Book> findAll() {
       return entityManager.createQuery("select t from Book t").getResultList();
    }

    @Nonnull
    @Override
    public Book update(@Nonnull Book entity) {
        return null;
    }

    @Nullable
    @Override
    public Book delete(@Nonnull Integer integer) {
        return null;
    }

    @Nullable
    @Override
    public Integer create(@Nonnull Book entity) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
