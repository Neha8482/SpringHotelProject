<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login</title>
	<style>
			.display-1{
				font-size:6rem;
			}
			.display-5{
				font-size:2rem;
			}
			.login-page-title-section{
				padding-top:50px;
				border-right:2px solid grey;
				height:400px;
				margin-top:150px;
				margin-right:150px;
			}
			
			.login-form{
				margin-top:210px;
			}
	
	</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-6 login-page-title-section">
				<p class="display-5 text-muted text-left">More Than a Hotel...An Experience</p>
				<h1 class="display-1 text-left">Hotel for the family all year around.</h1> 
				
			</div>
			<div class="col-lg-4 ">
				<form class="login-form">
					<h1>Log in </h1>
					<br/>
					<div class="form-group ">
						<label for="emailId">Email Id</label>
						<input type="email" class="form-control" name="emailId" id="emailid" placeholder="Enter your Email"/>
					</div>
					<div class="form-group">
						<label for="password">Password</label>
						<input type="password" class="form-control" name="password" id="password" placeholder="Enter your password"/>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-md btn-success" value="Login">
					</div>
				</form> 
			</div>
		</div>
	</div>
</body>
</html>