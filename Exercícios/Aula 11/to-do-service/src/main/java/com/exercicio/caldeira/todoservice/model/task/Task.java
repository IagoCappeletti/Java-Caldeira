package com.exercicio.caldeira.todoservice.model.task.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Task {
    private Long id;
    private String descricao;
    private LocalDate dataDeVencimento;
    private boolean estado;
}
