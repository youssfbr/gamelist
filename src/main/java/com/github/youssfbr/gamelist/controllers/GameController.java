package com.github.youssfbr.gamelist.controllers;

import com.github.youssfbr.gamelist.dtos.GameMinDTO;
import com.github.youssfbr.gamelist.services.IGameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private final IGameService gameService;

    public GameController(IGameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAllGames() {
        return ResponseEntity.ok(gameService.findAllGames());
    }
}
