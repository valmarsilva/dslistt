package com.devsuperiorr.dslistt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperiorr.dslistt.dto.GameMinDTO;
import com.devsuperiorr.dslistt.entities.Game;
import com.devsuperiorr.dslistt.repositories.GameRepository;

@Service
public class GameService {
	
	

		
		@Autowired
        private GameRepository gameRepository;	
		public List<GameMinDTO>  findAll(){
			
			List<Game>result = gameRepository.findAll();
			return result.stream().map(x -> new GameMinDTO(x)).toList();
			
	}

}
