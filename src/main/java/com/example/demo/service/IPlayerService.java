package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import com.example.demo.model.Player;




@Named
public interface IPlayerService {
	
	 Player save(Player player);
	 Player getById(int id);
	 List<Player> findAll();
	 List<Player> getAll();
	Optional<Player> findbyId(int id);
	 List<Player> findByFirstName(String firstName);
 	
	public void deleteById(int id);
}


	



