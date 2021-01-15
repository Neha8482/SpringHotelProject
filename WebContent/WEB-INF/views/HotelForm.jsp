<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Hotel Registration</title>
	<style>
		.registration-form{
			margin:auto;
			margin-top:30px;
			box-shadow:5px 5px 5px 5px grey;
			width:800px;
			padding:30px;
					
		}
		.display-3{
			font-size:4rem;
			
		}
		.hotel-details{
			border:2px solid grey;
			padding:15px;
		}
		.hotel-address{
			margin-top:10px;
			border:2px solid grey;
			padding:15px;
		}
	</style>
</head>
<body>
	<div class="container">
		<form class="registration-form" action="http://localhost:8080/SpringFinalProject/hotel" method="post">
			<p class="display-3">Enter Hotel Details</p>
			<div class="hotel-details">
				<div class="row">
					<div class="col-lg-6">
						<div class="form-group">
							<label for="hotelName">Hotel Name</label>
							<input type="text" class="form-control" name="hotelName" id="hotelName" placeholder="Enter hotel name"/>
						</div>
					</div>
					<div class="col-lg-6">
						<div class="form-group">
							<label for="email">Email</label>
							<input type="email" class="form-control" name="email" id="email" placeholder="Enter hotel email"/>
						</div>
					</div>
				</div>
				<div class="row">	
					<div class="col-lg-6">
						<div class="form-group">
							<label for="password">Password</label>
							<input type="password" class="form-control" name="password" id="password" placeholder="Enter your password"/>
				 		</div>
					</div>
					<div class="col-lg-6">
						<div class="form-group">
		 				<label for="contactNumber">Contact Number</label>
		 				<input type="number" class="form-control" name="contactNumber" id="contactNumber" placeholder="Enter your contact number"/>
		 			</div>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-6">
						<div class="form-group">
		 					<label for="noOfRooms">No of Room in the hotel</label>
		 					<input type="number" class="form-control" name="noOfRooms" id="noOfRooms" placeholder="Enter no of rooms"/>
		 				</div>
					</div>
					<div class="col-lg-6">
						<div class="form-group">
	 						<label for="roomCost">Cost of room</label>
	 						<input type="number" class="form-control" name="roomCost" id="roomCost" placeholder="Enter room cost"/>
	 					</div>
					</div>
				</div>
	 		</div>	
	 		<br /><br />
	 		<p class="display-3">Enter Hotel Address</p>
 			<div class="hotel-address">
 				<div class="row">
 					<div class="col-lg-12">
 						<div class="form-group">
			 				<label for="streetAddress">Street Address</label>
			 				<input class="form-control" type="text" name="streetAddress" id="streeAddress" placeholder="Enter Address"/>
			 			</div>
 					</div>
 				</div>
 				<div class="row">
 					<div class="col-lg-4">
 						<div class="form-group">
 							<label for="city">City</label>
 							<input type="text" class="form-control" name="city" id="city" placeholder="Enter city name"/>
 						</div>
 					</div>
 					<div class="col-lg-4">
 						<div class="form-group">
			 				<label for="state">State</label>
			 				<input type="text" class="form-control" name="state" id="state" placeholder="Enter State name"/>
			 			</div>
 					</div>
 					<div class="col-lg-4">
 						<div class="form-group">
 							<label for="pincode">Pincode</label>
 							<input type="number" class="form-control" name="pincode" id="pincode" placeholder="Enter pincode"/>
 						</div>
 					</div>
 				</div>
 			</div>
 			<br /><br />
 			<div class="row">
 				<div class="col-lg-12">
 					<div class="form-group">
 						<input type="submit" class="btn btn-lg btn-success" value="Register Your Hotel!"/>
 					</div>
 				</div>
 			</div>
		</form>
	</div>
</body>