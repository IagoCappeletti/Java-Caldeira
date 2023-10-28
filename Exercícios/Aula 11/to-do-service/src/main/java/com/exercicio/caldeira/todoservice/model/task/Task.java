package com.exercicio.caldeira.todoservice.model.task;

import lombok.*;

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



