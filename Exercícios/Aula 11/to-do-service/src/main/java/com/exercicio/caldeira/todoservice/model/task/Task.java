package com.exercicio.caldeira.todoservice.model.task;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor

public class Task {
    private int id;
    private String descricao;
    private LocalDate dataDeVencimento;
    private boolean estado;
}
