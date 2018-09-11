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


import com.example.demo.model.Team;
import com.example.demo.service.ITeamService;

@Controller
@RequestMapping("/team")
@CrossOrigin(origins = { "http://localhost:4201" })
public class TeamController {

	@Inject
	ITeamService teamService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Team createTeam(@RequestBody Team team) {
		return teamService.save(team);
	}
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable(value = "id") int id) {
 		teamService.deleteById(id);
    }
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Team> getAll() {
		return teamService.getAll();
	}
	
//	 Recherche par nom de la team
   @RequestMapping(value = "/teamName/{teamName}", method = RequestMethod.GET)
   @ResponseBody
       public List<Team> findByTeamName(@PathVariable(value="teamName") String teamName) {
       System.out.println("TeamName = " + teamName);
       return teamService.findByTeamName(teamName);
   }
	
	// Recherche par ID
   @RequestMapping(value = "/{id}", method = RequestMethod.GET)
   @ResponseBody
   public Team getById(@PathVariable (value= "id") int id) {
   	return teamService.getById(id);
   }
   
   @RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Team update(@RequestBody Team team) {

		Team update = teamService.save(team);
		return update;

	}
	
}
