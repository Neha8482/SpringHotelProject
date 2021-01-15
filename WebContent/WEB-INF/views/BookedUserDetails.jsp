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
	<th>HOTEL EMAIL</th>
	<th>GUEST EMAIL</th>
	<th>CHECK IN DATE</th>
	<th>CHECK OUT DATE</th>
	<th>DAYS</th>
	<th>ROOM COST PER DAY</th>
	</thead>
	
	<tbody>
	<c:forEach var="userDetails" items="${bookedUserDetails }">
	<tr>
		<td>${userDetails.bookingId}</td>
		<td>${userDetails.hotelEmail}</td>
		<td>${userDetails.guestEmail}</td>
		<td>${userDetails.checkInDate}</td>
		<td>${userDetails.checkOutDate}</td>
		<td>${userDetails.days}</td>
		<td>${userDetails.room_cost_perDay}</td>
		</tr>
	</c:forEach>
	</tbody>
	
</table>

</body>
</html>