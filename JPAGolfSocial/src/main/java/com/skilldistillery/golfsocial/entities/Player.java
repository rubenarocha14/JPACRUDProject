package com.skilldistillery.golfsocial.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "first_name")
	private String firstName;
	
	@Column (name = "last_name")
	private String lastName;
	
	private  int handicap;
	
	private String city;
	
	private String state;
	
	private String image;
	
	public Player() {
		
	}

	public Player(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", firstName=" + firstName + "]";
	}
}
