package com.example.demo.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.demo.model.Team;
import com.example.demo.repository.TeamRepository;

@Named
public class TeamService implements ITeamService {

	@Inject
	TeamRepository teamRepository;

	public Team save(Team team) {
		return teamRepository.save(team);
	}

	public Team getById(int id) {
		return teamRepository.getById(id);
	}

	public List<Team> getAll() {

		return teamRepository.findAll();
	}

	public List<Team> findByTeamName(String teamName) {
		return teamRepository.findByTeamName(teamName);
	}

	public void deleteById(int id) {
		teamRepository.deleteById(id);

	}

}
