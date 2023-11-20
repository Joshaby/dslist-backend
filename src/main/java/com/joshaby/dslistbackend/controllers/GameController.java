package com.joshaby.dslistbackend.controllers;

import com.joshaby.dslistbackend.dtos.GameDTO;
import com.joshaby.dslistbackend.dtos.GameMinDTO;
import com.joshaby.dslistbackend.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameMinDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GameDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
