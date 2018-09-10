package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

//Team of player
@Column(name = "team",nullable=false)
private String team;

}
