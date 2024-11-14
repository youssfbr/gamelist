package com.github.youssfbr.gamelist.services;

import com.github.youssfbr.gamelist.dtos.GameMinDTO;
import com.github.youssfbr.gamelist.repositories.IGameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService implements IGameService {

    private final IGameRepository gameRepository;

    public GameService(IGameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAllGames() {
        return gameRepository.findAll()
                .stream()
                .map(GameMinDTO::new)
                .toList();
    }
}
