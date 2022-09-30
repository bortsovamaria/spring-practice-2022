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
        return entityManager.merge(entity);
    }

    @Nullable
    @Override
    public Book delete(@Nonnull Integer id) {
        Book book = entityManager.find(Book.class, id);
        entityManager.remove(book);
        return book;
    }

    @Nullable
    @Override
    public Integer create(@Nonnull Book entity) {
        entityManager.persist(entity);
        return entity.getId();
    }

    @Override
    public void deleteAll() {
        List<Book> books = findAll();
        books.forEach(b -> delete(b.getId()));
    }
}
