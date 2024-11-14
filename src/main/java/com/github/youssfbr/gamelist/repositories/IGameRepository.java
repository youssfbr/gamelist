package com.github.youssfbr.gamelist.repositories;

import com.github.youssfbr.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGameRepository extends JpaRepository<Game , Long> {
}
