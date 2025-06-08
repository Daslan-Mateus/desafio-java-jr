package com.example.desafio_java_jr.dto;

import com.example.desafio_java_jr.entity.Author;

import java.util.Date;
import java.util.Set;

public record WorkDto( Integer id, String name, String description,
                       Date publicationDate, Date exhibitionDate, Set<Author> authors) {}
