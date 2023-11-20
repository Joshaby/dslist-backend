package com.joshaby.dslistbackend.repositories;

import com.joshaby.dslistbackend.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
