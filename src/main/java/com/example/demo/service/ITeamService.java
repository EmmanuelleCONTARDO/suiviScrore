package com.example.demo.service;

import java.util.List;



import com.example.demo.model.Team;


public interface ITeamService {
	Team save(Team team);
	Team getById(int id);
	List<Team> getAll();
	List <Team> findByTeamName(String teamName);
	public void deleteById(int id);
	

}
