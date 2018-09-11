package com.example.demo.repository;

import java.util.List;

import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.SportingEvent;

@Named
public interface SportingEventRepository extends JpaRepository <SportingEvent, Integer> {

	
	public SportingEvent getById(@Param("id") int id);
	public List <SportingEvent> findAll();
	
	public List <SportingEvent> findByLeagueDay(String leagueDay);
	public void deleteById(int id);
	
	
}
