package com.xoriant.client;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xoriant.beans.Address;
import com.xoriant.beans.Guest;
import com.xoriant.beans.Hotel;
import com.xoriant.beans.Userlogin;
import com.xoriant.dao.GuestDaoImpl;



@Controller
@RequestMapping("/project")
@ComponentScan(basePackages = "com.xoriant.beans")
public class Client {
	
	@RequestMapping(value="/GuestForm",method=RequestMethod.GET)
	public ModelAndView getGuestForm() {
		ModelAndView modelAndView = new ModelAndView("GuestDetailsPage");
		return modelAndView;
	}
	
	@RequestMapping(value="/guest",method=RequestMethod.POST)
	public ModelAndView getUserDetails(@RequestParam("guestName") String guestName,@RequestParam("email") String email,@RequestParam("contactNumber") String contactNumber,
			@RequestParam("gender") String gender,@RequestParam("password") String password){
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GuestDaoImpl guestDao = (GuestDaoImpl) context.getBean("UserDao");
		
		Guest guest = new Guest();
		guest.setGuestName(guestName);
		guest.setEmail(email);
		guest.setGender(gender);
		guest.setContactNumber(contactNumber);
		guest.setPassword(password);
		
		Integer id = guestDao.addGuest(guest);
		System.out.println(id);
	
		ModelAndView modelAndView = new ModelAndView("Guest");
		modelAndView.addObject("guest",guest);
		return modelAndView;
	}
	
	@RequestMapping(value="/HotelForm",method=RequestMethod.GET)
	public ModelAndView getHotelForm() {
		ModelAndView modelAndView = new ModelAndView("HotelForm");
		return modelAndView;
	}
	
	@RequestMapping(value="/hotel",method=RequestMethod.POST)
	public ModelAndView getHotelDetails(@RequestParam("hotelName") String hotelName,@RequestParam("email") String email,@RequestParam("contactNumber") String contactNumber,
			@RequestParam("streetAddress") String streetAddress,@RequestParam("city") String city,@RequestParam("state") String state,@RequestParam("pincode") String pincode,@RequestParam("noOfRooms") String noOfRooms,@RequestParam("roomCost") String roomCost,@RequestParam("password") String password){
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GuestDaoImpl guestDao = (GuestDaoImpl) context.getBean("UserDao");
		
		Address address = new Address(streetAddress,city,state,pincode);
		Hotel hotel = new Hotel(hotelName,contactNumber,Double.parseDouble(roomCost),Integer.parseInt(noOfRooms),email,password,address);
		Integer id = guestDao.addHotel(hotel);
		System.out.println(id);
	
		ModelAndView modelAndView = new ModelAndView("Hotel");
		modelAndView.addObject("address",address);
		modelAndView.addObject("hotel",hotel);
		return modelAndView;
	}
	
	@RequestMapping(value="/UserLogin",method=RequestMethod.GET)
	public ModelAndView getLoginForm() {
		ModelAndView modelAndView = new ModelAndView("UserLogin");
		return modelAndView;
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public ModelAndView getUserLoginDetails(@RequestParam("userId") String email,@RequestParam("password") String password){
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GuestDaoImpl guestDao = (GuestDaoImpl) context.getBean("UserDao");
		
		boolean isUSer = guestDao.authenticateUser(email, password);
		
		if(isUSer) {
		ModelAndView modelAndView = new ModelAndView("Hotels");
		modelAndView.addObject("msg","Hotels");
		return modelAndView;
		}else {
			ModelAndView modelAndView = new ModelAndView("IncorrectCredentials");
			return modelAndView;
		}
	}
	
	@RequestMapping(value="/HotelLogin",method=RequestMethod.GET)
	public ModelAndView getHotelLoginForm() {
		ModelAndView modelAndView = new ModelAndView("HotelLogin");
		return modelAndView;
	}
	
	@RequestMapping(value="/manager",method=RequestMethod.POST)
	public ModelAndView getLoginDetails(@RequestParam("userId") String email,@RequestParam("password") String password){
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GuestDaoImpl guestDao = (GuestDaoImpl) context.getBean("UserDao");
		
		boolean isUSer = guestDao.authenticateHotel(email, password);
		
		if(isUSer) {
		ModelAndView modelAndView = new ModelAndView("Hotels");
		modelAndView.addObject("msg","Hotels");
		return modelAndView;
		}else {
			ModelAndView modelAndView = new ModelAndView("IncorrectCredentials");
			return modelAndView;
		}
	}
	
	@RequestMapping("/hotel")
	public ModelAndView getRequests() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		txn.commit();
		session.close();
		
		factory.close();
		ModelAndView modelAndView = new ModelAndView("Hotels");
		return modelAndView;
	}
}
