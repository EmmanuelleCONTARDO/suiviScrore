package com.example.demo.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Player;
import com.example.demo.service.IPlayerService;


@RestController
@RequestMapping("/player")
@CrossOrigin(origins = { "http://localhost:4201" })
public class PlayerController {
	@Inject
	private IPlayerService playerService;
	
	
	
	//public PlayerController() {
	//}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public int create(@RequestBody Player res) {
		//System.out.println(res);
	    return playerService.save(res).getId();
	}
	
 	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deletee(@PathVariable(value = "id") int id) {
 		playerService.deleteById(id);
    }
	
 	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Player> findAll() {
		return playerService.getAll();
	}
 	
 	// Recherche par nom de l'aliment
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
        public List<Player> findByName(@PathVariable(value="name") String name) {
        System.out.println("name = " + name);
        return playerService.findByName(name);
    }
 
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void update(@PathVariable(value = "id") int id, @RequestBody Player res) {
        res.setId(id);     
        playerService.save(res).getId();

    }
	
}
