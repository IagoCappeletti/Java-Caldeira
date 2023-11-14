package com.caldeiraJava.Aula14.controller;

import com.caldeiraJava.Aula14.jogo.Jogo;
import com.caldeiraJava.Aula14.jogo.dto.DadosAtualizacaoJogoDTO;
import com.caldeiraJava.Aula14.jogo.dto.DadosCadastroJogosDTO;
import com.caldeiraJava.Aula14.jogo.dto.DadosListagemJogoDTO;
import com.caldeiraJava.Aula14.jogo.repository.JogoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("jogos")
public class jogoController {

    @Autowired //Injeção de dependência
    private JogoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroJogosDTO dados){
        repository.save(new Jogo(dados));
    }

    @GetMapping
    public Page<DadosListagemJogoDTO> listar(@PageableDefault(size = 10/*, sort = {"nomeDoJogo"}*/) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemJogoDTO::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoJogoDTO dados){
        var jogo = repository.getReferenceById(dados.id());
        jogo.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id) {
        var jogo = repository.getReferenceById(id);
        jogo.inativar();

    }

}
