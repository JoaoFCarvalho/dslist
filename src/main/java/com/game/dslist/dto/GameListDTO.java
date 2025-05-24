package com.game.dslist.dto;

// import org.springframework.beans.BeanUtils; "Pode ser usado se quiser, caso não gerar somente metodo get"

import com.game.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){
    }
    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
