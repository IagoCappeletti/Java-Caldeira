package com.github.ninja.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ninjas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private boolean status;
    private String nivel;
}
