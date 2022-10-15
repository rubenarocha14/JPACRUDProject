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
	
	@Column (name = "image_url")
	private String imageUrl;
	
	public Player() {
		
	}

	public Player(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}
	
	public Player(int id, String firstName, String lastName, int handicap, String city, String state, String image) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.handicap = handicap;
		this.city = city;
		this.state = state;
		this.imageUrl = image;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getHandicap() {
		return handicap;
	}

	public void setHandicap(int handicap) {
		this.handicap = handicap;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getImage() {
		return imageUrl;
	}

	public void setImage(String image) {
		this.imageUrl = image;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", firstName=" + firstName + "]";
	}
}
