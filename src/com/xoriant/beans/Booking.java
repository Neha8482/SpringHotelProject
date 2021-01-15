package com.xoriant.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking_details1")
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer bookingId;
	@Column
	private Integer hotelId;
	@Column
	private String hotelEmail;
	@Column
	private String guestEmail;
	@Column
	private String checkInDate;
	@Column
	private String checkOutDate;
	@Column
	private int days;
	@Column
	private double room_cost_perDay;
	
	public Booking() {
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	
	
	public String getGuestEmail() {
		return guestEmail;
	}
	public String getHotelEmail() {
		return hotelEmail;
	}
	public void setHotelEmail(String hotelEmail) {
		this.hotelEmail = hotelEmail;
	}
	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public double getCost() {
		return room_cost_perDay;
	}
	public void setCost(double room_cost_perDay) {
		this.room_cost_perDay = room_cost_perDay;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", hotelEmail=" + hotelEmail + ", guestEmail=" + guestEmail
				+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", days=" + days
				+ ", room_cost_perDay=" + room_cost_perDay + "]";
	}
	
	
	
}