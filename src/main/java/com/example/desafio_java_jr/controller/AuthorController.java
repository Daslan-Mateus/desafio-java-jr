package com.example.desafio_java_jr.controller;

import com.example.desafio_java_jr.dto.AuthorDto;
import com.example.desafio_java_jr.entity.Author;
import com.example.desafio_java_jr.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/authors")
    public ResponseEntity<AuthorDto> save(@RequestBody AuthorDto author) {
        return ResponseEntity.status(HttpStatus.CREATED).body(authorService.save(author));
    }
}
