package com.example.desafio_java_jr.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Descrição obrigatória")
    @Size(max = 240, message = "Tamanho máximo 240 caracteres")
    @Column(nullable = false, length = 240)
    private String description;

    private Date publicationDate;

    private Date exhibitionDate;
}
