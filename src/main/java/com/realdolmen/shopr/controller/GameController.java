package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class GameController {

    private Game newGame = new Game();

    @Inject
    private GameService gameService;

    public Game getNewGame() {
        return newGame;
    }

    public void setNewGame(Game newGame) {
        this.newGame = newGame;
    }

    public List<Game> getGames() {
        return this.gameService.findAllGames();
    }

    public void submit() {
        System.out.println(" test");
        this.gameService.insert(newGame);
    }

}
