<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Enter Hotel Details
<form action="http://localhost:8080/SpringFinalProject/project/hotel" method="post">
          Name : <input type="text" name="hotelName">
         <br/>
          EmailID : <input type="text" name="email">
         <br/>
          Contact Number : <input type="text" name="contactNumber">
         <br/>
          Address : <input type="text" name="streetAddress">
         <br/>
          City : <input type="text" name="city">
         <br/>
          State : <input type="text" name="state">
         <br/>
          Pincode : <input type="text" name="pincode">
         <br/>
          Number Of Rooms : <input type="text" name="noOfRooms">
         <br/>
          Room Cost per day : <input type="text" name="roomCost">
         <br/>
         Enter Password : <input type="text" name="password">
         <br/>
         <input type="submit" value="Click">
    </form>
</body>
</html>