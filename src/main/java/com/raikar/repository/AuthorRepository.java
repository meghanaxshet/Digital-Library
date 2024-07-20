package com.raikar.repository;

import com.raikar.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository  extends JpaRepository<Author,Integer> {

    @Query(value = "Select * from author where Email = :authorEmail", nativeQuery = true)
    Author getAuthorEmail(String authorEmail);



}
