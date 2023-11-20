package com.joshaby.dslistbackend.services;

import com.joshaby.dslistbackend.dtos.GameDTO;
import com.joshaby.dslistbackend.dtos.GameMinDTO;
import com.joshaby.dslistbackend.entities.Game;
import com.joshaby.dslistbackend.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository repository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        return new GameDTO(repository.findById(id).orElseThrow(
                () -> new RuntimeException("Não existe Game com Id" + id)));
    }

    public List<GameMinDTO> findAll() {
        return repository.findAll().stream().map(GameMinDTO::new).toList();
    }
}
