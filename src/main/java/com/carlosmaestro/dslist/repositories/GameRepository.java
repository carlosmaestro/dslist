package com.carlosmaestro.dslist.repositories;

import com.carlosmaestro.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
