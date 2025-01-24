package com.dev.superior.dslist.controllers;

import com.dev.superior.dslist.dto.GameDTO;
import com.dev.superior.dslist.dto.GameMiniDTO;
import com.dev.superior.dslist.entities.Game;
import com.dev.superior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

    @GetMapping
    public List<GameMiniDTO> findAll() {
        return gameService.findAll();
    }

}
