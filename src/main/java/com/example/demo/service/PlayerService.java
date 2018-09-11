package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepository;

@Named
public class PlayerService implements IPlayerService {

	@Inject
	PlayerRepository playerRepository;

	public Player save(Player p) {
		return playerRepository.save(p);

	}

	public Player getById(int id) {
		return playerRepository.getById(id);
	}

	public List<Player> findAll() {
		return playerRepository.findAll();
	}

	public List<Player> getAll() {
		return playerRepository.findAll();
	}

	public Optional<Player> findbyId(int id) {
		return playerRepository.findById(id);
	}

	public void deleteById(int id) {
		playerRepository.deleteById(id);
	}

	public List<Player> findByFirstName(String firstName) {

		return playerRepository.findByFirstName(firstName);
	}

}
