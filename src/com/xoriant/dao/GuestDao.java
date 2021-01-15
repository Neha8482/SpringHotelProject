package com.xoriant.dao;

import java.util.List;

import com.xoriant.beans.Address;
import com.xoriant.beans.Booking;
import com.xoriant.beans.Guest;
import com.xoriant.beans.Hotel;
import com.xoriant.beans.Hotellogin;
import com.xoriant.beans.Userlogin;


public interface GuestDao {

	public Integer addGuest(Guest guest);
	public void updateGuest(Guest g);
	public void deleteGuest(int guestId);
	public List<Guest> getAllGuests();
	public List<Guest> getGuest(String email);

	
	public List<Userlogin> getAllUsers();
	public Integer addUserLogin(Userlogin login);
	public boolean authenticateUser(String email,String password);
	public Integer addHotel(Hotel hotel);
	Integer addHotelLogin(Hotellogin login);
	List<Hotellogin> getAllHotelLogins();
	boolean authenticateHotel(String email, String password);
	public List<Hotel> getAllHotels();
	List<Hotel> getHotel(String email);
	List<Booking> getBookedUsers(String hotelEmail);
	List<Hotel> getHotelByAddress(String city);
	List<Hotel> getAllHotelsAsc();
	List<Hotel> getAllHotelsDesc();
	Guest getGuestById(Integer id);
	Address getAddressById(Integer id);
	List<Booking> getUserBooking(String email);
	

}
