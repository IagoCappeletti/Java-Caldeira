package com.caldeiraJava.Aula14.jogo.repository;

import com.caldeiraJava.Aula14.jogo.Jogo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
    Page<Jogo> findAllByAtivoTrue(Pageable paginacao);
}
