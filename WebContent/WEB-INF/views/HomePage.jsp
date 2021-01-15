<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	
	<title>Home</title>
	<style>
		.nav{
			box-shadow:5px 5px grey;
			height:80px;
			width:100%;
			margin-left:30px;
			
		}
		.shift-top{
			margin-top:10px;
		}
		.shift-right{
			margin-right:20px;
		}
		.shift-left{
			margin-left:20px;
		}
		.card{
			box-shadow:5px 5px 5px 5px grey;
			height:200px;
			padding:20px;
		}
		
	</style>
</head>
<body>
	<div class="nav">
		<h1 class="display-3">ABC Hotels</h1>
	</div>
	<div class="jumbotron">
		<div class="row justify-content-center">
			<div class="col-lg-12">
				<h1 class="display-2 text-center">Find And Book Your Hotel</h1>
			</div>
		</div>
  		<div class="row shift-top">
  			<div class="col-lg-12 text-center">
  		<a href="http://localhost:8080/SpringFinalProject/project/HotelLogin"><button class="btn btn-lg btn-success shift-right">Hotel Provider</button></a>
  				

  				<a href="http://localhost:8080/SpringFinalProject/project/UserLogin"><button class="btn btn-lg btn-success shift-right">Customer</button></a>
  				
  				
  			</div>
  		</div>
  	</div>
  	<div class="row shift-top shift-left shift-right">
  		<div class="col-lg-4">
  			<div class="card">
	  			<h1 class="card-title">Simplicity</h1>
	  			<h4 class="card-body">Easy to Use and very friendly platform</h4>
	  		</div>
  		</div>
  		<div class="col-lg-4">
  			<div class="card">
  				<h1 class="card-title">Our Services</h1>
  				<h4 class="card-body">World class customer services</h4>
  			</div>
  		</div>
  		<div class="col-lg-4">
  			<div class="card">
  				<h1 class="card-title">Availablity</h1>
  				<h4 class="card-body">We are available in 10 countries world wide!!</h4>
  			</div>
  		</div>
  		
  	</div>
</body>
</html>