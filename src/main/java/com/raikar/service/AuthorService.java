package com.raikar.service;

import com.raikar.model.Author;
import com.raikar.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author getAuthor(String email) {
        return authorRepository.getAuthorEmail(email);
    }
}
