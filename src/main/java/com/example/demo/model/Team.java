package com.example.demo.model;


import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "team")
public class Team {

	// Id of team and primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	// Name of team
	@Column(name = "teamName", nullable = false)
	private String teamName;

	// Name of town
	@Column(name = "townName", nullable = false)
	private String townName;

	// Relation with Players
	//@JsonIgnore
	@OneToMany(mappedBy = "team", fetch = FetchType.LAZY) // team correspond au team de player
	private List<Player> players;

	// relation with sportingEvent Home
	@JsonIgnore
	@OneToMany(mappedBy = "homeTeam", fetch = FetchType.LAZY) // 
	private List<SportingEvent> sportingEventsH;
	
	// relation with sportingEvent Visitor
		@JsonIgnore
		@OneToMany(mappedBy = "visitorTeam", fetch = FetchType.LAZY) // 
		private List<SportingEvent> sportingEventsV;
	
	// Constructor
	public Team() {
	}


	// Getters & Setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}


	public List<SportingEvent> getSportingEventsH() {
		return sportingEventsH;
	}


	public void setSportingEventsH(List<SportingEvent> sportingEventsH) {
		this.sportingEventsH = sportingEventsH;
	}


	public List<SportingEvent> getSportingEventsV() {
		return sportingEventsV;
	}


	public void setSportingEventsV(List<SportingEvent> sportingEventsV) {
		this.sportingEventsV = sportingEventsV;
	}


	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", townName=" + townName + ", players=" + players
				+ ", sportingEventsH=" + sportingEventsH + ", sportingEventsV=" + sportingEventsV + "]";
	}
	
}


