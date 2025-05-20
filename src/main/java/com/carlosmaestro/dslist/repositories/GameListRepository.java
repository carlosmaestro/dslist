package com.carlosmaestro.dslist.repositories;

import com.carlosmaestro.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
