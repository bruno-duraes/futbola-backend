package com.futbola.futbola.model.service;

import com.futbola.futbola.model.entity.PatotaEntity;
import com.futbola.futbola.model.repository.PatotaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatotaService {

    private final PatotaRepository patotaRepository;

    public PatotaEntity buscarPatota(Long id) {
        return patotaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Patota não encontrada."));
    }
}
