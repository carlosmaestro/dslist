package com.carlosmaestro.dslist.services;

import com.carlosmaestro.dslist.dto.GameDTO;
import com.carlosmaestro.dslist.dto.GameMinDTO;
import com.carlosmaestro.dslist.exceptions.RecordNotFoundException;
import com.carlosmaestro.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        return gameRepository.findById(id).map(GameDTO::new).orElseThrow(()-> new RecordNotFoundException(id));
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long id) {
        return gameRepository.searchByList(id).stream().map(GameMinDTO::new).toList();
    }
}
