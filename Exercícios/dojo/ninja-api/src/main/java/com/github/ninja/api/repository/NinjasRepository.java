package com.github.ninja.api.repository;

import com.github.ninja.api.models.Ninjas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjasRepository extends JpaRepository<Ninjas, Long> {
}
