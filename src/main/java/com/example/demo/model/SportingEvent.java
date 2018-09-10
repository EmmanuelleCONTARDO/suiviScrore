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

	// Name of hometeam
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teamHome_fk")
	private Team homeTeam;

	// Name of visitorteam
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teamVisit_fk")
	private Team visitorTeam;

	// score of match
	@Column(name = "score", nullable = false)
	private int score;

	// date of match
	@Column(name = "date", nullable = false)
	private String date;
	

	// constructor
	public SportingEvent() {
		}


	// Getters & Setter
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "SportingEvent [id=" + id + ", homeTeam=" + homeTeam + ", visitorTeam=" + visitorTeam + ", score="
				+ score + ", date=" + date + "]";
	}
	
	
	
	
}
