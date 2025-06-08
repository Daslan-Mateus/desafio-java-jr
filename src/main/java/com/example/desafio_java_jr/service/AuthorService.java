package com.example.desafio_java_jr.service;

import com.example.desafio_java_jr.dto.AuthorDto;
import com.example.desafio_java_jr.entity.Author;
import com.example.desafio_java_jr.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public AuthorDto save(AuthorDto authorDto) {
        Author authorEntity = toEntity(authorDto);
        return toDto(authorRepository.save(authorEntity));
    }

    private Author toEntity(AuthorDto authorDto) {
        return new Author(authorDto.id(),
                authorDto.name(), authorDto.cpf(), authorDto.email(), authorDto.birth(),
                authorDto.country(), authorDto.cpf(), authorDto.works());
    }

    private AuthorDto toDto(Author author){
        return  new AuthorDto(author.getId(), author.getName(), author.getSex(),
                author.getEmail(), author.getBirth(), author.getCountry(), author.getCpf(),
                author.getWorks());
    }


}
