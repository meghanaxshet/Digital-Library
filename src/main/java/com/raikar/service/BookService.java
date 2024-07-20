package com.raikar.service;

import com.raikar.dto.BookRequest;
import com.raikar.model.Author;
import com.raikar.model.Book;
import com.raikar.repository.AuthorRepository;
import com.raikar.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
