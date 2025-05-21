package com.devsuperiorr.dslistt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiorr.dslistt.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
