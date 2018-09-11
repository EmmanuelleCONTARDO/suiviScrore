package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sportingEvent")
public class SportingEvent {

	// Id of sportingEvent and primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	// Day of sporting Event
	@Column (name = "LeagueDay")
	private String leagueDay;
	

	// Name of hometeam
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "teamHome_fk")
	private Team homeTeam;

	// Name of visitorteam
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "teamVisit_fk")
	private Team visitorTeam;

	// score of match  home team
	@Column(name = "scoreHome")
	private int scoreH;

	// score of match visitor team
	@Column(name = "scoreVisitor")
	private int scoreV;
	
	//
	// constructor
	public SportingEvent() {
		}

	//
	// Getters & Setter
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getLeagueDay() {
		return leagueDay;
	}

	public void setLeagueDay(String leagueDay) {
		this.leagueDay = leagueDay;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}


	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}


	public Team getVisitorTeam() {
		return visitorTeam;
	}


	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}

	public int getScoreH() {
		return scoreH;
	}

	public void setScoreH(int scoreH) {
		this.scoreH = scoreH;
	}

	public int getScoreV() {
		return scoreV;
	}

	public void setScoreV(int scoreV) {
		this.scoreV = scoreV;
	}

	@Override
	public String toString() {
		return "SportingEvent [id=" + id + ", leagueDay=" + leagueDay + ", homeTeam=" + homeTeam + ", visitorTeam="
				+ visitorTeam + ", scoreH=" + scoreH + ", scoreV=" + scoreV + "]";
	}






	
	
	
	
}
