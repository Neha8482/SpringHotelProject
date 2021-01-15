<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2" width="70%" cellpadding="2">
	<thead>
	<th>BOOKING ID</th>
	<th>HOTEL ID</th>
	<th>REGISTERED EMAIL</th>
	<th>CHECK IN DATE</th>
	<th>CHECK OUT DATE</th>
	<th>COST</th>
	</thead>
	
	<tbody>
	<c:forEach var="booking" items="${bookingList}">
	<tr>
		<td>${booking.bookingId}</td>
		<td>${booking.hotelId}</a></td>
		<td>${booking.guestEmail}</td>
		<td>${booking.checkInDate}</td>
		<td>${booking.checkOutDate}</td>
		<td>${booking.cost}</td>
		<td><a href="viewHotel/${booking.hotelId}">Details</a></td>
	</tr>
		
	</c:forEach>
	</tbody>
	
</table>

</body>
</html>