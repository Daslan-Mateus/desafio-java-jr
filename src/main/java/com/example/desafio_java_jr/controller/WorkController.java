package com.example.desafio_java_jr.controller;

import com.example.desafio_java_jr.entity.Work;
import com.example.desafio_java_jr.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkController {
    @Autowired
    WorkService workService;

    @PostMapping("/works")
    public ResponseEntity<Work> save(@RequestBody Work work) {
        return ResponseEntity.status(HttpStatus.CREATED).body(workService.save(work));

    }
}
