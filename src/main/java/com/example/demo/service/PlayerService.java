package com.example.demo.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepository;

@Named
public class PlayerService implements IPlayerService {

	@Inject
	PlayerRepository playerRepository;

	public Player savePlayer(Player player) {
		playerRepository.save(player);
		return player;
	}

	public List<Player> getAll() {
		return playerRepository.findAll();
	}

	public List<Player> findAll() {
		return playerRepository.findAll();
	}

	public Player getById(int id) {
		return playerRepository.getById(id);
	}

	public void deleteById(int id) {
		playerRepository.deleteById(id);
	}

	@Override
	public Player save(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
