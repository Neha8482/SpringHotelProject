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
	public void updateGuest(Integer guestId, String email) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
	    Guest guest = session.get(Guest.class, guestId);
	    guest.setEmail(email);
	    session.update(guest);
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
	public List<Guest> getGuest(Integer guestId) {
		List<Guest> guests = null;
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql = "FROM Guest e where e.guestId = "+ guestId;
		TypedQuery<Guest> query = session.createQuery(hql);
		guests = query.getResultList();
		return guests;
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
		/*Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		Userlogin user = session.get(Userlogin.class, email);
		if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
			userpresent= true;
		}*/
		List<Userlogin> usersList = getAllUsers();
		System.out.println("        ");
		System.out.println(usersList);
		System.out.println("  ");
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
	

}
