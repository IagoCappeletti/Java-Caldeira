package com.github.ninja.api.repository;

import com.github.ninja.api.models.Missoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissoesRepository extends JpaRepository<Missoes, Long> {
}
