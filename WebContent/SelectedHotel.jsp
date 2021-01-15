<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Selected</title>
</head>
<body>
	<p>
			<b>Selected Hotel</b>
            <%= request.getParameter("HotelId")%>
     </p>
     
     <form action="http://localhost:8080/SpringFinalProject/viewHotel" method="post">
     	<input type="hidden" name="hotelId" value="<%= request.getParameter("HotelId")%>"/>
     	<input type="submit" value="Click to see">  	
     </form>
</body>
</html>