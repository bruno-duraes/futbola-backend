package com.futbola.futbola.model.repository;

import com.futbola.futbola.model.entity.PatotaJogadorEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatotaJogadorRepository extends JpaRepository<PatotaJogadorEntity, Long> {

    List<PatotaJogadorEntity> findAllByPatota_IdAndAtivoTrue(Long patotaId);
}
