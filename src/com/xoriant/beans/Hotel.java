package com.xoriant.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="hotel_id")
	@PrimaryKeyJoinColumn
	private Integer hotelId;
	
	@Column(name="hotel_name")
	private String hotelName;

	@Column(name="contact_number")
	private String contactNumber;
	
    @Column(name="room_cost_per_day")
	private double room_cost_perDay;
    
    @Column(name="no_of_rooms")
	private Integer noOfRooms;
    
    @Column(name="email")
    private String email;
    
    @Column(name="password")
    private String password;
	
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	private Address address;

	public Hotel() {
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, String contactNumber, double room_cost_perDay, Integer noOfRooms, String email,
			String password, Address address) {
		super();
		this.hotelName = hotelName;
		this.contactNumber = contactNumber;
		this.room_cost_perDay = room_cost_perDay;
		this.noOfRooms = noOfRooms;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public double getRoom_cost_perDay() {
		return room_cost_perDay;
	}

	public void setRoom_cost_perDay(double room_cost_perDay) {
		this.room_cost_perDay = room_cost_perDay;
	}

	public Integer getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", contactNumber=" + contactNumber
				+ ", room_cost_perDay=" + room_cost_perDay + ", noOfRooms=" + noOfRooms + ", email=" + email
				+ ", password=" + password + ", address=" + address + "]";
	}


	
	

}
