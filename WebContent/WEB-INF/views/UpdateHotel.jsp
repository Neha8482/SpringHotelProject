<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8080/SpringFinalProject/updateHotel/${hotel.hotelId}" method="post">
          Id : <input type="text" value=${hotel.hotelId} name="hotelId">
         <br/>
          Name : <input type="text" value=${hotel.hotelName} name="hotelName">
         <br/>
          EmailID : <input type="text"  value=${hotel.email} name="email">
         <br/>
          Contact Number : <input type="text"  value=${hotel.contactNumber} name="contactNumber">
         <br/>
         Address ID: <input type="text"  value=${hotel.address.addressId} name="addressId">
         <br/>
          Address : <input type="text"  value=${hotel.address.street} name="street">
         <br/>
          City : <input type="text"  value=${hotel.address.city} name="city">
         <br/>
          State : <input type="text"  value=${hotel.address.state} name="state">
         <br/>
          Pincode : <input type="text"  value=${hotel.address.pincode} name="pincode">
         <br/>
          Number Of Rooms : <input type="text"  value=${hotel.noOfRooms} name="noOfRooms">
         <br/>
          Room Cost per day : <input type="text"  value=${hotel.room_cost_perDay} name="room_cost_perDay">
         <br/>
         Enter Password : <input type="text"  value=${hotel.password} name="password">
         <br/>
         <input type="submit" value="Click">
    </form>
</body>
</html>