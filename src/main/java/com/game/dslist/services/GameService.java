package com.game.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.dslist.dto.GameMinDTO;
import com.game.dslist.entities.Game;
import com.game.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        //Se quiser fazer diretamente pode fazer return "result.stream().map(x -> new GameMinDTO(x)).toList();"
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;


    }
}
