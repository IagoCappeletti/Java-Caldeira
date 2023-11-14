package com.caldeiraJava.Aula14.jogo.dto;

import com.caldeiraJava.Aula14.jogo.Categoria;
import com.caldeiraJava.Aula14.jogo.Plataforma;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoJogoDTO(
        @NotNull
        Long id,
        String descricao,
        Categoria categoria,
        Plataforma plataforma) {

}
