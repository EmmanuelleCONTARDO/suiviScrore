package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Player;



@Named
public interface PlayerRepository extends JpaRepository<Player, Integer> {

	public Player getById(@Param("id") int id);
	public List<Player> findAll();
	
	
	public List<Player> findByFirstName(String firstName);
	public void deleteById(int id);    
}
