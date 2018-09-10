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
	
	 List<Player> findByName(String name);
 	
	public void deleteById(int id);
}

