package com.kubsu.gameservice.services;

import com.kubsu.gameservice.entities.Developer;
import com.kubsu.gameservice.entities.Game;
import com.kubsu.gameservice.entities.Publisher;
import com.kubsu.gameservice.repositories.DeveloperRepository;
import com.kubsu.gameservice.repositories.GameRepository;
import com.kubsu.gameservice.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    @Autowired
    DeveloperRepository developerRepository;

    @Autowired
    PublisherRepository publisherRepository;

    public Game getGame(long id){
        return gameRepository.findOne(id);
    }

    public Iterable<Game> getDev(long id){
        return developerRepository.findOne(id).getGames();
    }

    public Iterable<Game> getGames(){
        return gameRepository.findAll();
    }

    public Iterable<Developer> getDevelopers(){
        return developerRepository.findAll();
    }

    public Iterable<Publisher> getPublishers(){
        return publisherRepository.findAll();
    }
}
