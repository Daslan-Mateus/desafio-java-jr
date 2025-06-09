package com.example.desafio_java_jr.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private String sex;

    @Column(unique = true)
    private String email;

    private Date birth;

    private String country;

    private String cpf;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "author_work",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name =  "work_id")
    )
    private Set<Work> works = new HashSet<>();
}
