package com.raikar.controller;

import com.raikar.model.Author;
import com.raikar.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
 @Autowired
    private AuthorService authorService;

    @GetMapping("/getAuthorData")
    public Author getAuthor(@RequestParam("Email") String email){
       return  authorService.getAuthor(email);
    }
}
