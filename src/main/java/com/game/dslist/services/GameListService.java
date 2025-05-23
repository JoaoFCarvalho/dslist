package com.game.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.game.dslist.dto.GameListDTO;
import com.game.dslist.entities.GameList;
import com.game.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        //Se quiser fazer diretamente pode fazer return "result.stream().map(x -> new GameMinDTO(x)).toList();"
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
