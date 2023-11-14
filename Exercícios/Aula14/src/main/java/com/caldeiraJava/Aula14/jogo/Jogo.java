package com.caldeiraJava.Aula14.jogo;

import com.caldeiraJava.Aula14.jogo.dto.DadosAtualizacaoJogoDTO;
import com.caldeiraJava.Aula14.jogo.dto.DadosCadastroJogosDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "jogos")
@Entity(name = "Jogo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id") //Gera o EqualsAndHashCode em cima do ID, não em todos os atributos.
public class Jogo {
    //Classe JPA

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String desenvolvedor;
    private String empresa;
    private String nomeDoJogo;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @Enumerated(EnumType.STRING)
    private Plataforma plataforma;
    private Boolean ativo;

    public Jogo(DadosCadastroJogosDTO dados) {
        this.ativo = true;
        this.desenvolvedor = dados.desenvolvedor();
        this.empresa = dados.empresa();
        this.nomeDoJogo  = dados.nomeDoJogo();
        this.descricao = dados.descricao();
        this.categoria = dados.categoria();
        this.plataforma = dados.plataforma();
    }

    public void atualizarInformacoes(DadosAtualizacaoJogoDTO dados) {
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.categoria() != null) {
            this.categoria = dados.categoria();
        }
        if (dados.plataforma() != null) {
            this.plataforma = dados.plataforma();
        }
    }

    public void inativar() {
        this.ativo = false;
    }
}
