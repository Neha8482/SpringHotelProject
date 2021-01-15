<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />

 <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
 <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>

 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

 <script>     
     $(function() {
     $( ".datepicker" ).datepicker();
                  });
</script>
   
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking</title>
</head>
<body>
 <br/> <br/> <br/>

Name :  ${hotel.hotelName}
 <br/>
Email :  ${hotel.email}
 <br/>
Contact Number : ${hotel.contactNumber}
 <br/>
Address :  ${hotel.address.street}
 <br/>
City :  ${hotel.address.city}
 <br/>
State :  ${hotel.address.state}
 <br/>
Pincode :  ${hotel.address.pincode}
 <br/>
Room cost Per day :  ${hotel.room_cost_perDay}
 <br/>
Number of Rooms available :  ${hotel.noOfRooms}

<form action="http://localhost:2200/SpringFinalProject/bookingSuccessful" method="post">
	<label>Please Enter Your Email ID:</label>
	<input type="text" name="guestEmail">
	<br/>
	<br/>
	
	<label>Please Enter Check In Date</label>
	<input type="date" name="checkInDate" class="datepicker">
	<br/>
	<br/>
	
	<label>Please Enter Check Out Date</label>
	<input type="date" name="checkOutDate" class="datepicker">
	<br/>
	<br/>

	<input type="hidden" name="hotelId" value="${hotel.hotelId }">
	<input type="hidden" name="hotelEmail" value="${hotel.email}">
	
	<input type="hidden" name="costPerDay" value="${hotel.room_cost_perDay}">
	<input type="submit" value="Book Room"/>
</form>
<h3>A detailed bill will be available When you login. </h3>
</body>

</html>