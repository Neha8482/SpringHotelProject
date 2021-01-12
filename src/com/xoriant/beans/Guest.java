package com.xoriant.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="guest")
public class Guest {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="guest_id")
	private Integer guestId;
	
	@Column(name="guest_name")
	private String guestName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact_number")
	private String contactNumber;
	
	@Column(name="guest")
	private String gender;
	
	@Column(name="password")
	private String password;
	
	public Guest() {
	}
	
	

	public Guest(String guestName, String email, String contactNumber, String gender, String password) {
		super();
		this.guestName = guestName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.password = password;
	}



	public Integer getGuestId() {
		return guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Guest [guestId=" + guestId + ", guestName=" + guestName + ", email=" + email + ", contact=" + contactNumber
				+ ", gender=" + gender + "]";
	}
	
	
}
