package com.deelu.simplilearn.training;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Make this the Entity class
@Entity
@Table(name = "persondetails")
public class Person {
	
	Person(){
		
	}
	
	@Id
	@Column(name = "personid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int personid;
	
	@Column(name = "personname")
	String personname;
	
	@Column(name = "personaddress")
	String personaddress;

	public Person(String personame, String personaddress) {
		this.personname = personname;
		this.personaddress = personaddress;
	}

	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personname=" + personname + ", personaddress=" + personaddress + "]";
	}
	
	
	
	
	

}