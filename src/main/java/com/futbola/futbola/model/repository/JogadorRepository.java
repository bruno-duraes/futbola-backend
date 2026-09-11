package com.futbola.futbola.model.repository;

import com.futbola.futbola.model.entity.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<JogadorEntity, Long> {
}
