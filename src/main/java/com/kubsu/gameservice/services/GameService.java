package com.kubsu.gameservice.services;

import com.kubsu.gameservice.entities.Game;
import com.kubsu.gameservice.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public Game getGame(long id){
        return gameRepository.findOne(id);
    }

    public Iterable<Game> getGames(){
        return gameRepository.findAll();
    }
}
