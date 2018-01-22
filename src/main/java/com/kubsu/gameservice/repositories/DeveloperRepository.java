package com.kubsu.gameservice.repositories;

import com.kubsu.gameservice.entities.Developer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends CrudRepository<Developer, Long>{
}
