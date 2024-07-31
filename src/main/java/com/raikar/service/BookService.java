package com.raikar.service;

import com.raikar.dto.BookRequest;
import com.raikar.model.*;
import com.raikar.repository.AuthorRepository;
import com.raikar.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(BookRequest bookRequest) {
    Author authorFromDb = authorRepository.getAuthorEmail(bookRequest.getAuthorEmail());
    if(authorFromDb == null ){
      authorFromDb = authorRepository.save(bookRequest.toAuthor());

    }
   Book book = bookRequest.toBook();
   book.setAuthor(authorFromDb);

   return bookRepository.save(book);
    }

    public List<Book> filter(FilterType filterType, Operation operation, String value) {
        switch (filterType){
            case BOOK_TYPE :
                switch (operation){
                    case EQUALS :
                        return bookRepository.findByBookType(BookType.valueOf(value));

                }
            case BOOK_TITLE:
                switch (operation){
                    case EQUALS :
                        return bookRepository.findByTitle(value);
                }

        }
        return new ArrayList<>();
    }
}
