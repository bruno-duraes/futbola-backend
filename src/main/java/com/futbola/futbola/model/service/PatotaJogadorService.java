package com.futbola.futbola.model.service;

import com.futbola.futbola.model.entity.PatotaJogadorEntity;
import com.futbola.futbola.model.repository.PatotaJogadorRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatotaJogadorService {

    private final PatotaJogadorRepository patotaJogadorRepository;

    public List<PatotaJogadorEntity> buscarMensalistasAtivosDaPatota(Long patotaId) {
        return patotaJogadorRepository.findAllByPatota_IdAndAtivoTrue(patotaId);
    }
}
