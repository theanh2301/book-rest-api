package com.company.book_rest_api.controller;

import com.company.book_rest_api.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String hello() {
        return "print";
    }

    private ConcurrentHashMap<String, Book> books;
    public BookController() {
        books = new ConcurrentHashMap<>();
        books.put("0X-13", new Book("OX-13", "Gone with the wind", "Cuong", 1977));
    }

    @GetMapping
    public List<Book> getBooks() {

        return books.values().stream().toList();
    }
}
