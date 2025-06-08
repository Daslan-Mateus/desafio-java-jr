package com.example.desafio_java_jr.dto;

import com.example.desafio_java_jr.entity.Work;

import java.util.Date;
import java.util.Set;

public record AuthorDto(Integer id, String name, String sexo, String email,
                        Date birth, String country, String cpf,
                        Set<Work> works){}
