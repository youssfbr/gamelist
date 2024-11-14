package com.github.youssfbr.gamelist.dtos;

import com.github.youssfbr.gamelist.entities.Game;

public record GameMinDTO(
        Long id ,
        String title ,
        Integer year ,
        String imgUrl ,
        String shortDescription
) {
    public GameMinDTO(Game entity) {
        this(
            entity.getId() ,
            entity.getTitle() ,
            entity.getYear() ,
            entity.getImgUrl() ,
            entity.getShortDescription());
    }
}
