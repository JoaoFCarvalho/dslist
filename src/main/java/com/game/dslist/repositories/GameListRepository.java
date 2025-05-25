package com.game.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.game.dslist.entities.GameList;

// Camada responsável por acesso e consulta no banco
public interface GameListRepository extends JpaRepository<GameList, Long> {

    @Modifying
    @Query(nativeQuery=true,
        value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
    void  updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
