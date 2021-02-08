package com.simplilear.springdemo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int Id;
	private String name;
	private Date birthdate;
	
	
	
	//default constructor for hibernate framework
	
	public Customer() {
		super();
	}



	public Customer(int id, String name, Date birthdate) {
		Id = id;
		this.name = name;
		this.birthdate = birthdate;
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getBirthdate() {
		return birthdate;
	}



	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}



	@Override
	public String toString() {
		return String.format("Customer [Id=%s, name=%s, birthdate=%s]", Id, name, birthdate);
	}



	
	
	
	
	
}
