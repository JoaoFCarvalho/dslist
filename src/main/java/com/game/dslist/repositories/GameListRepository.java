package com.game.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.dslist.entities.GameList;

// Camada responsável por acesso e consulta no banco
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
