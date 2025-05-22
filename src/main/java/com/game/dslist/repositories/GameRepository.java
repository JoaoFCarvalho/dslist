package com.game.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.dslist.entities.Game;

// Camada responsável por acesso e consulta no banco
public interface GameRepository extends JpaRepository<Game, Long> {

}
