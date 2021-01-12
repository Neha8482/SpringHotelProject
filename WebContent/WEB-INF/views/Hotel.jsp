<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hotel with UserId  ${hotel.hotelId} created .
 <br/> <br/> <br/>

Name :  ${hotel.hotelName}
 <br/>
Email :  ${hotel.email}
 <br/>
Contact Number : ${hotel.contactNumber}
 <br/>
Address :  ${address.street}
 <br/>
City :  ${address.city}
 <br/>
State :  ${address.state}
 <br/>
Pincode :  ${address.pincode}
 <br/>
Room cost Per day :  ${hotel.room_cost_perDay}
 <br/>
Number of Rooms available :  ${hotel.noOfRooms}

</body>
</html>