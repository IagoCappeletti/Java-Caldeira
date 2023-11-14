package com.caldeiraJava.Aula14.jogo.dto;

import com.caldeiraJava.Aula14.jogo.Categoria;
import com.caldeiraJava.Aula14.jogo.Jogo;
import com.caldeiraJava.Aula14.jogo.Plataforma;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosListagemJogoDTO(
        Long id,
        @NotBlank
        String nomeDoJogo,
        @NotBlank
        String descricao,
        @NotNull
        Categoria categoria,
        @NotNull
        Plataforma plataforma) {

        public DadosListagemJogoDTO(Jogo jogo) {
                this(jogo.getId(), jogo.getNomeDoJogo(), jogo.getDescricao(), jogo.getCategoria(),jogo.getPlataforma());
        }
}
