package com.xoriant.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.xoriant.beans.Address;
import com.xoriant.beans.Booking;
import com.xoriant.beans.Guest;
import com.xoriant.beans.Hotel;
import com.xoriant.beans.Hotellogin;
import com.xoriant.beans.Userlogin;

@Component("UserDao")
public class GuestDaoImpl implements GuestDao {
private SessionFactory factory;
	
	public GuestDaoImpl() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		factory = meta.getSessionFactoryBuilder().build();
	}

	@Override
	public Integer addGuest(Guest guest) {
		Integer guestId = null;
		Integer user = null;
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		guestId = (Integer) session.save(guest);
		user=addUserLogin(new Userlogin(guest.getEmail(),guest.getPassword()));
		txn.commit();
		session.close();
		return guestId;
	
	}

	@Override
	public void updateGuest(Guest g) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
	    Guest guest = session.get(Guest.class, g.getGuestId());
	    guest.setContactNumber(g.getContactNumber());
	    guest.setEmail(g.getEmail());
	    guest.setGender(g.getGender());
	    guest.setGuestName(g.getGuestName());
	    guest.setPassword(g.getPassword());
	    session.update(guest);
	    txn.commit();
		session.close();	
	}
	
	public void updateHotel(Integer hotelId, String hotelName, String email, String contactNumber
		, Integer addressId, String streetAddress,String city, String state, String pincode, Integer noOfRooms,Double roomCost,String password)
	{
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
	    Address a=session.get(Address.class, addressId);
		a.setCity(city);
		a.setState(state);
		a.setPincode(pincode);
		a.setStreet(streetAddress);
		session.update(a);
		 Hotel h = session.get(Hotel.class, hotelId);
		h.setAddress(a);
		h.setContactNumber(contactNumber);
		h.setEmail(email);
		h.setHotelName(hotelName);
		h.setNoOfRooms(noOfRooms);
		h.setRoom_cost_perDay(roomCost);
		h.setPassword(password);
		System.out.println();
		System.out.println(h);
		System.out.println();
	    session.update(h);
	    txn.commit();
		session.close();	
	}


	@Override
	public void deleteGuest(int guestId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Guest> getAllGuests() {
		List<Guest> guest = null;
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql = "FROM Guest";
		TypedQuery<Guest> query = session.createQuery(hql);
		guest= query.getResultList();
		session.close();
	    return guest;
	}


	@Override
	public List<Hotel> getAllHotels(){
		List<Hotel> hotelList= null;
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql="FROM Hotel";
		TypedQuery<Hotel> query= session.createQuery(hql);
		hotelList= query.getResultList();
		txn.commit();
		session.close();
		return hotelList;
	}
	@Override
	public List<Guest> getGuest(String email) {
		List<Guest> guests = null;
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql = "FROM Guest e where e.email= :email";
		TypedQuery<Guest> query = session.createQuery(hql,Guest.class);
		query.setParameter("email", email);
		guests = query.getResultList();
		return guests;
	}

	@Override
	public Guest getGuestById(Integer id) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		Guest guest = session.get(Guest.class, id);
		txn.commit();
		session.close();
		return guest;
	}
	@Override
	public Address getAddressById(Integer id) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		Address address = session.get(Address.class, id);
		txn.commit();
		session.close();
		return address;
	}
	
	@Override
	public List<Hotel> getHotel(String email) {
		List<Hotel> hotel = null;
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql = "FROM Hotel e where e.email= :email";
		TypedQuery<Hotel> query = session.createQuery(hql);
		query.setParameter("email", email);
		hotel = query.getResultList();
		return hotel;
	}

	@Override
	public List<Userlogin> getAllUsers() {
		List<Userlogin> users = null;
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql = "FROM Userlogin";
		TypedQuery<Userlogin> query = session.createQuery(hql);
		users = query.getResultList();
		session.close();
	    return users;	
	    }
	
	
	@Override
	public List<Hotellogin> getAllHotelLogins() {
		List<Hotellogin> users = null;
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql = "FROM Hotellogin";
		TypedQuery<Hotellogin> query = session.createQuery(hql);
		users = query.getResultList();
		System.out.println(users);
		session.close();
	    return users;
	    }
	

	@Override
	public Integer addUserLogin(Userlogin login) {
		Integer userId = null;
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		userId = (Integer)session.save(login);
		txn.commit();
		session.close();
		return userId;	
	}

	@Override
	public boolean authenticateUser(String email, String password) {
		boolean userpresent = false;
		List<Userlogin> usersList = getAllUsers();
		for(Userlogin u : usersList) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				userpresent = true;
			}
		}
		System.out.println(userpresent);
		System.out.println();
		return userpresent;
	}
	
	@Override
	public Integer addHotel(Hotel hotel) {
		Integer hotelId = null;
		Integer user = null;
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		hotelId = (Integer) session.save(hotel);
		user=addHotelLogin(new Hotellogin(hotel.getEmail(),hotel.getPassword()));
		txn.commit();
		session.close();
		return hotelId;
	
	}
	@Override
	public Integer addHotelLogin(Hotellogin login) {
		Integer userId = null;
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		userId = (Integer)session.save(login);
		txn.commit();
		session.close();
		return userId;	
	}
	
	

	@Override
	public boolean authenticateHotel(String email, String password) {
		boolean userpresent = false;
		List<Hotellogin> usersList = getAllHotelLogins();
		for(Hotellogin u : usersList) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				userpresent = true;
			}
		}
		System.out.println(userpresent);
		System.out.println();
		return userpresent;
	}
	
	public Hotel getHotelById(Integer hotelId) {
		List<Hotel> hotelList= null;
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql="FROM Hotel h where h.hotelId="+hotelId;
		TypedQuery<Hotel> query= session.createQuery(hql);
		hotelList= query.getResultList();
		session.close();
		return hotelList.get(0);
	}
	public Integer addBooking(Booking booking) {
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		Integer bookingId= (Integer)session.save(booking);
		txn.commit();
		session.close();
		return bookingId;
	}
	
	@Override
	public List<Booking> getBookedUsers(String hotelEmail){
		List<Booking> bookedUsers= null;
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		TypedQuery<Booking> query= session.createQuery("FROM Booking b where b.hotelEmail='"+hotelEmail+"'");
		bookedUsers=query.getResultList();
		txn.commit();
		session.close();
		return bookedUsers;
	}
	@Override
	public List<Booking> getUserBooking(String email){
		List<Booking> userBooking=null;
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		TypedQuery<Booking> query= session.createQuery("FROM Booking b where b.guestEmail='"+email+"'");
		userBooking= query.getResultList();
		return userBooking;
	}
	@Override
	public List<Hotel> getAllHotelsAsc(){
		List<Hotel> hotelList= null;
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql="FROM Hotel h ORDER BY h.room_cost_perDay ASC";
		TypedQuery<Hotel> query= session.createQuery(hql);
		hotelList= query.getResultList();
		txn.commit();
		session.close();
		return hotelList;
	}
	@Override
	public List<Hotel> getAllHotelsDesc(){
		List<Hotel> hotelList= null;
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql="FROM Hotel h ORDER BY h.room_cost_perDay DESC";
		TypedQuery<Hotel> query= session.createQuery(hql);
		hotelList= query.getResultList();
		txn.commit();
		session.close();
		return hotelList;
	}
	@Override
	public List<Hotel> getHotelByAddress(String city){
		List<Hotel> hotelList= null;
		Session session =  factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql="FROM Hotel h where h.address.city='"+city+"'";
		//String hql="FROM Hotel h WHERE h.Address.addressId= some(select addressId FROM Address a where a.city ='"+ city+ "')";
		TypedQuery<Hotel> query= session.createQuery(hql);
		hotelList= query.getResultList();
		System.out.println(hotelList);
		session.close();
		return hotelList;
		
	}

	


}
