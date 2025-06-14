package com.example.desafio_java_jr.service;

import com.example.desafio_java_jr.exception.NullDatePublicationAndExhibition;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CommonRules {

    public void isNullDatePublicationAndExhibition(LocalDate publicationDate, LocalDate exhibitionDate) {
        if(publicationDate == null && exhibitionDate == null) {
            throw new NullDatePublicationAndExhibition("Data da publicação e da exebição não podem ser nulas ao mesmo tempo");
        }
    }
}
