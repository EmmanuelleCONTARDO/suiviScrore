package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


import com.example.demo.model.Team;

public interface TeamRepository extends JpaRepository<Team, Integer>{
	
	public Team getById(@Param("id") int id);
	public List<Team> findAll();
	
	
	public List<Team> findByTeamName(String teamName);
	public void deleteById(int id);   
	
}
