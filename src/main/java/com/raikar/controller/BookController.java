package com.raikar.controller;

import com.raikar.dto.BookRequest;
import com.raikar.model.Book;
import com.raikar.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
public Book addBook(@RequestBody @Valid BookRequest bookRequest){
 Book book = bookService.addBook(bookRequest);
return book;


}

}
