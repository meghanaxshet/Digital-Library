package com.raikar.repository;

import com.raikar.model.Book;
import com.raikar.model.BookType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    

    List<Book> findByBookType(BookType value);

    List<Book> findByTitle(String value);
}

