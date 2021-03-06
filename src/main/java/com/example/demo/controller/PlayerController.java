package com.example.demo.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.model.Player;
import com.example.demo.service.IPlayerService;

@Controller
@RequestMapping("/player")
@CrossOrigin(origins = { "http://localhost:4201" })
public class PlayerController {

	@Inject
	IPlayerService playerService;

	// public PlayerController() {
	// }

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Player createPlayer(@RequestBody Player player) {
		return playerService.save(player);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable(value = "id") int id) {
		playerService.deleteById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Player> getAll() {
		return playerService.getAll();
	}

	// Recherche par nom du joueur
	@RequestMapping(value = "/firstname/{firstName}", method = RequestMethod.GET)
	@ResponseBody
	public List<Player> getByFirstName(@PathVariable(value = "firstName") String firstName) {
		System.out.println("name = " + firstName);
		return playerService.findByFirstName(firstName);
	}

	// Recherche par ID
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Player getById(@PathVariable(value = "id") int id) {
		return playerService.getById(id);
	}

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Player update(@RequestBody Player player) {

		Player update = playerService.save(player);
		return update;

	}
}
