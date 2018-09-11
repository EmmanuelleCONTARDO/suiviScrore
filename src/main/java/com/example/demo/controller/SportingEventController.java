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

import com.example.demo.model.SportingEvent;
import com.example.demo.service.ISportingEventService;

@Controller
@RequestMapping("/sportingevent")
@CrossOrigin(origins = { "http://localhost:4201" })
public class SportingEventController {

	@Inject
	ISportingEventService sportingEventService;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public SportingEvent createsportingEvent(@RequestBody SportingEvent sportingEvent) {
		return sportingEventService.save(sportingEvent);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable(value = "id") int id) {
		sportingEventService.deleteById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<SportingEvent> getAll() {
		return sportingEventService.getAll();
	}

	// Search day of match
	@RequestMapping(value = "/sportingevent/{leaguedDay}", method = RequestMethod.GET)
	@ResponseBody
	public List<SportingEvent> findByLeagueDay(@PathVariable(value = "leaguedDay") String leaguedDay) {
		System.out.println("Day of match = " + leaguedDay);
		return sportingEventService.findByLeagueDay(leaguedDay);
	}

	// Recherche par ID
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public SportingEvent getById(@PathVariable(value = "id") int id) {
		return sportingEventService.getById(id);
	}

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public SportingEvent update(@RequestBody SportingEvent sportingEvent) {

		SportingEvent update = sportingEventService.save(sportingEvent);
		return update;

	}

}
