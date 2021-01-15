<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8080/SpringFinalProject/updateUser/${guest.guestId}" method="post">
          ID : <input type="text" value=${guest.guestId} name="guestId">
         <br/>
          Name : <input type="text" value=${guest.guestName} name="guestName">
         <br/>
          EmailID : <input type="text" value=${guest.email} name="email">
         <br/>
          Contact Number : <input type="text" value=${guest.contactNumber} name="contactNumber">
         <br/>
          Gender : <input type="text" value=${guest.gender} name="gender">
         <br/>
          Password : <input type="text" value=${guest.password} name="password">
         <br/>
         <input type="submit" value="Click">
    </form>
</body>
</html>