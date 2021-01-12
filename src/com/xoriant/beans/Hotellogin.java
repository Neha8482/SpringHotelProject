package com.xoriant.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;


@Entity
@Table(name="hotellogin")
public class Hotellogin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Integer hotel_id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	public Hotellogin() {
		// TODO Auto-generated constructor stub
	}	

	public Hotellogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public Integer getHotel_id() {
		return hotel_id;
	}



	public void setHotel_id(Integer hotel_id) {
		this.hotel_id = hotel_id;
	}



	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Hotellogin [hotel_id=" + hotel_id + ", email=" + email + ", password=" + password + "]";
	}
	
}
