package com.joshaby.dslistbackend.controllers;

import com.joshaby.dslistbackend.dtos.GameListDTO;
import com.joshaby.dslistbackend.services.GameListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/game-list")
@RequiredArgsConstructor
public class GameListController {

    private final GameListService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameListDTO> findAll() {
        return service.findAll();
    }
}
