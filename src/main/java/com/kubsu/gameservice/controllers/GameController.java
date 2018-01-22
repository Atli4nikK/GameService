package com.kubsu.gameservice.controllers;

import com.kubsu.gameservice.entities.Developer;
import com.kubsu.gameservice.entities.Game;
import com.kubsu.gameservice.entities.Publisher;
import com.kubsu.gameservice.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GameController {

    @Autowired
    GameService gameService;

//    @GetMapping("/games")
//    public Iterable<Game> getGames(){
//        return gameService.getGames();
//    }

    @RequestMapping(value ="/games/{id}", method = RequestMethod.GET)
    public  ModelAndView getGame(@PathVariable long id){
        Map<String, Object> model = new HashMap<>();
        Game game = (Game) gameService.getGame(id);
        model.put("games", game);
        return new ModelAndView("games", model);
    }

//    @RequestMapping(value ="/games/{id}", method = RequestMethod.GET)
//    public  ModelAndView getGameByDev(@PathVariable long id){
//        Map<String, Object> model = new HashMap<>();
//        List<Game> game = (List<Game>) gameService.getDev(id);
//        model.put("games", game);
//        return new ModelAndView("games", model);
//    }

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = { "/games" }, method = RequestMethod.GET)
    public ModelAndView gamesList() {
        Map<String, Object> model = new HashMap<>();
        List<Game> games = (List<Game>) gameService.getGames();
        model.put("games", games);
        return new ModelAndView("games", model);
    }

    @RequestMapping(value = { "/developers" }, method = RequestMethod.GET)
    public ModelAndView developerList() {
        Map<String, Object> model = new HashMap<>();
        List<Developer> developers = (List<Developer>) gameService.getDevelopers();
        model.put("developers", developers);
        return new ModelAndView("developers", model);
    }

    @RequestMapping(value = { "/publishers" }, method = RequestMethod.GET)
    public ModelAndView publisherList() {
        Map<String, Object> model = new HashMap<>();
        List<Publisher> publishers = (List<Publisher>) gameService.getPublishers();
        model.put("publishers", publishers);
        return new ModelAndView("publishers", model);
    }
}
