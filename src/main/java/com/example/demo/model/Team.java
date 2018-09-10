package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {
	
	//Id of team and primary key
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	// Name of team
	@Column(name = "teamName",nullable=false)
	private String teamName;
	
	// Name of town
	@Column(name = "townName",nullable=false)
	private String townName;

}
