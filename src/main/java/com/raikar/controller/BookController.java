package com.raikar.controller;

import com.raikar.dto.BookRequest;
import com.raikar.model.Author;
import com.raikar.model.Book;
import com.raikar.model.FilterType;
import com.raikar.model.Operation;
import com.raikar.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody @Valid BookRequest bookRequest) {
        Book book = bookService.addBook(bookRequest);
        return book;
    }

    @GetMapping("/filter")
    public List<Book> filter(@RequestParam("filterType") FilterType filterType,
                             @RequestParam("operation") Operation operation,
                             @RequestParam("value") String value) {
return bookService.filter(filterType,operation,value);

    }


}
