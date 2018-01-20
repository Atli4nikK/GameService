package com.example.demo.Services;

import com.example.demo.Entities.Game;
import com.example.demo.Repositories.GameRepository;
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
