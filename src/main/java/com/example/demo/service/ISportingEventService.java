package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SportingEvent;

public interface ISportingEventService {

	SportingEvent save(SportingEvent sportingEvent);
	SportingEvent getById(int id);
	List <SportingEvent> getAll();
	List <SportingEvent>findByLeagueDay(String leagueDay);
	public void deleteById(int id);
	
}
