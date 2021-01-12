package com.xoriant.dao;

import java.util.List;

import com.xoriant.beans.Guest;
import com.xoriant.beans.Hotel;
import com.xoriant.beans.Hotellogin;
import com.xoriant.beans.Userlogin;


public interface GuestDao {

	public Integer addGuest(Guest guest);
	public void updateGuest(Integer guestId,String email);
	public void deleteGuest(int guestId);
	public List<Guest> getAllGuests();
	public List<Guest> getGuest(Integer guestId);

	
	public List<Userlogin> getAllUsers();
	public Integer addUserLogin(Userlogin login);
	public boolean authenticateUser(String email,String password);
	public Integer addHotel(Hotel hotel);
	Integer addHotelLogin(Hotellogin login);
	List<Hotellogin> getAllHotelLogins();
	boolean authenticateHotel(String email, String password);
	

}
