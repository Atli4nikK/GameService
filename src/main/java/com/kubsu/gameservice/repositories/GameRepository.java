package com.kubsu.gameservice.repositories;

import com.kubsu.gameservice.entities.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, Long>{
}
