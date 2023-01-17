<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Register</title>
</head>
<body>


	<%@include file="base.jsp"%>
	<%@include file="navbar.jsp"%>
	<%@include file="baseCss.jsp" %>

<div class = "bigimg">
<br>
	<div align="center">
		<h1 style="color: white; margin-top: 7%;">Registeration</h1>

		<form:form action="registerFormHandler" method="POST" modelAttribute="user">
	
			<div class="form-group" style="margin-top: 3%">
				<input
					type="text" class="form-control" id="name" name = "name"
					aria-describedby="textHelp" placeholder="Enter name" style="width: 30%" required="required">
			</div>
	
			<div class="form-group">
				<input
					type="email" class="form-control" id="email" name = "email"
					aria-describedby="emailHelp" placeholder="Enter email" style="width: 30%" required="required">
			</div>
	
			<div class="form-group"> 
				<input
					type="password" class="form-control" id="password" name = "password"
					placeholder="Create password" style="width: 30%" required="required">
			</div>
	
			<button type="submit" class="btn btn-danger">Submit</button>
	
		</form:form>

	</div>
	
</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>