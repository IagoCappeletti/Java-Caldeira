package com.exercicio.caldeira.todoservice.model.task;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.*;

import java.time.LocalDate;

@Data
public class Task {
    private Long id;
    @NotBlank(message = "A tarfea não pode estar vazia")
    private String descricao;
    @Future(message = "A data de vencimento deve estar no futuro!")
    @NotNull(message = "A data não estar vazia!")
    private LocalDate dataDeVencimento;
    @NotNull
    private boolean estado;
}



