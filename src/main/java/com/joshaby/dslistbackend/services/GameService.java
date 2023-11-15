package com.joshaby.dslistbackend.services;

import com.joshaby.dslistbackend.dtos.GameDTO;
import com.joshaby.dslistbackend.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository repository;

    public List<GameDTO> findAll() {
        return repository.findAll().stream().map(GameDTO::new).toList();
    }
}
