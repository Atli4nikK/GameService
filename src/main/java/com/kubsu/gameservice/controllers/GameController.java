package com.kubsu.gameservice.controllers;

import com.kubsu.gameservice.entities.Game;
import com.kubsu.gameservice.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping("/games/{id}")
    public  Game getGame(@PathVariable long id){
        return gameService.getGame(id);
    }

    @GetMapping("/games")
    public Iterable<Game> getGames(){
        return gameService.getGames();
    }
}
