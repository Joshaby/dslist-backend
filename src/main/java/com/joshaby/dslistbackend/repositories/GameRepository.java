package com.joshaby.dslistbackend.repositories;

import com.joshaby.dslistbackend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
