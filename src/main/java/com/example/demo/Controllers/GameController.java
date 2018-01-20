package com.example.demo.Controllers;

import com.example.demo.Entities.Game;
import com.example.demo.Repositories.GameRepository;
import com.example.demo.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("/games/{id}")
    public  Game getGame(@PathVariable long id){
        return gameService.getGame(id);
    }

    @GetMapping("/games")
    public Iterable<Game> getGames(){
        return gameService.getGames();
    }
}
