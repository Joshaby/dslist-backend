package com.joshaby.dslistbackend.controllers;

import com.joshaby.dslistbackend.dtos.GameListDTO;
import com.joshaby.dslistbackend.dtos.GameMinDTO;
import com.joshaby.dslistbackend.services.GameListService;
import com.joshaby.dslistbackend.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games-list")
@RequiredArgsConstructor
public class GameListController {

    private final GameListService service;

    private final GameService gameService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameListDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{listId}/games")
    @ResponseStatus(HttpStatus.OK)
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
