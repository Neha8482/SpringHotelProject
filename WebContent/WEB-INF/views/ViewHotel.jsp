<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 

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

</body>
</html>