package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

	public List<Player> findAll();
	Player getById(@Param("id") int id);
	List<Player> getByFirstName(String firstName);
	void deleteById(int id);    
}
