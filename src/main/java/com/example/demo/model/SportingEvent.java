package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sportingEvent")
public class SportingEvent {

	// Id of sportingEvent and primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	// Name of hometeam
	@Column(name = "homeTeam", nullable = false)
	private String homeTeam;

	// Name of visitorteam
	@Column(name = "visitorTeam", nullable = false)
	private String visitorTeam;

	// score of match
	@Column(name = "score", nullable = false)
	private int score;

	// date of match
	@Column(name = "date", nullable = false)
	private String date;
	
}
