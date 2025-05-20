package com.carlosmaestro.dslist.controllers;

import com.carlosmaestro.dslist.dto.GameDTO;
import com.carlosmaestro.dslist.dto.GameMinDTO;
import com.carlosmaestro.dslist.services.GameService;
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

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping(path = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }
}
