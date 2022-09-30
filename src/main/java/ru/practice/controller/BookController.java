package ru.practice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.practice.domain.Book;
import ru.practice.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;


    @GetMapping
    public List<Book> books() {
        return bookService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Book department(@PathVariable Integer id) {
        return bookService.getById(id);
    }
}
