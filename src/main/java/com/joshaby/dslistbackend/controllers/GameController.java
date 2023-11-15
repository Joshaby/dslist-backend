package com.joshaby.dslistbackend.controllers;

import com.joshaby.dslistbackend.dtos.GameDTO;
import com.joshaby.dslistbackend.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameDTO> findAll() {
        return service.findAll();
    }
}
