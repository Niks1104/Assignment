package com.test.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")

public class Customer 
{
	@Id
	@Column(name="CUSTID")
	private int id;
	@Column(name="CFIRSTNAME")
	 private String firstName;
	@Column(name="CLASTNAME")
	 private String lastName;
	 @Column(name="CEMAIL")
	 private String email;
	 
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
			
	
}

