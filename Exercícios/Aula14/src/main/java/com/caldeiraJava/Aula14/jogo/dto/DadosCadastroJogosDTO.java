package com.caldeiraJava.Aula14.jogo.dto;

import com.caldeiraJava.Aula14.jogo.Categoria;
import com.caldeiraJava.Aula14.jogo.Plataforma;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DadosCadastroJogosDTO(
        @NotBlank
        String desenvolvedor,
        @NotBlank
        String empresa,
        @NotBlank
        String nomeDoJogo,
        @NotBlank
        String descricao,
        @NotNull
        Categoria categoria,
        @NotNull
        Plataforma plataforma) {
}
