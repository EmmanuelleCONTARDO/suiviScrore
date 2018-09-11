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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "player")
public class Player {
	
	// Id of player & primary key
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	// Lastname of player
	@Column(name = "lastName",nullable=false)
	private String lastName;
	
	//firstname of player
	@Column(name = "firstName",nullable=false)
	private String firstName;
	
	//Date of birth of player
	@Column(name = "birthDate",nullable=false)
	private String birthDate;
	
	//Position of player
	@Column(name = "position",nullable=false)
	private String position;
	
	
	//Name of player team & relation with Team
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "team_fk") 
	@JsonIgnore
	private Team team;

	
	 // constructor 
	 public Player() {
		 }


	 
	//Getters & Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		
		return "Player [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", birthDate=" + birthDate
				+ ", position=" + position + ", team=" + team + "]";
	}
	
	
}
	 
	 
	
