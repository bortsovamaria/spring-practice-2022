package ru.practice.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import ru.practice.domain.Book;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class BookDaoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BookDao bookDao;

    @Test
    public void findById() {
        Book book = new Book().setName("test");
        entityManager.persist(book);
        Book byId = bookDao.findById(book.getId());
        assertEquals(book, byId);
    }
}