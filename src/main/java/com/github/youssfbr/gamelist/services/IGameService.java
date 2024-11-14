package com.github.youssfbr.gamelist.services;

import com.github.youssfbr.gamelist.dtos.GameMinDTO;
import com.github.youssfbr.gamelist.dtos.GameMinDTOClass;

import java.util.List;

public interface IGameService {

    List<GameMinDTO> findAllGames();
}
