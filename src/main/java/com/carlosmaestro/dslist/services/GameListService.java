package com.carlosmaestro.dslist.services;

import com.carlosmaestro.dslist.dto.GameListDTO;
import com.carlosmaestro.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional
    public List<GameListDTO> findAll(){
        return gameListRepository.findAll().stream().map(GameListDTO::new).toList();
    }
}
