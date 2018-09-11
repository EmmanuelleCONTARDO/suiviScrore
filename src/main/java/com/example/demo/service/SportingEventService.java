package com.example.demo.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.demo.model.SportingEvent;
import com.example.demo.repository.SportingEventRepository;

@Named
public class SportingEventService implements ISportingEventService {

	@Inject
	SportingEventRepository sportingEventRepository;

	public SportingEvent save(SportingEvent sportingEvent) {
		return sportingEventRepository.save(sportingEvent);
	}

	public SportingEvent getById(int id) {
		return sportingEventRepository.getById(id);
	}

	
	public List<SportingEvent> getAll() {
		return sportingEventRepository.findAll();
	}


	public List<SportingEvent> findByLeagueDay(String leagueDay) {
	
		return sportingEventRepository.findByLeagueDay(leagueDay);
	}


	public void deleteById(int id) {
		sportingEventRepository.deleteById(id);

	}

}
