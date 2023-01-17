<%@page import="spring.project.model.DataOfMarks"%>

<%@page import="java.util.List"%>

<%@page isELIgnored="false"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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

<style type="text/css">

	th{
		color: white;
		font-weight: bold;
	}
	
	td{
		color: white;
		font-weight: bold;
	}

</style>

<title>Leader Board</title>
</head>
<body>

	<%@include file="base.jsp"%>
	<%@include file="quizNavbar.jsp"%>
	<%@include file="baseCss.jsp"%>

	<%
	List<DataOfMarks> list = (List<DataOfMarks>) request.getAttribute("list");
	%>


<div class = "bigimg">
	<br>
	<div align="center" style="margin-top: 1%; color: white;">
		<h2>Leader board</h2>
	</div>
	<div align="center"
		style="margin-top: 2%; width: 85%; margin-left: 7.5%;">

		<table class="table">

			<thead class="thead-dark">
				<tr>
					<th scope="col">S.No</th>
					<th scope="col">Name</th>
					<th scope="col">Marks</th>
				</tr>
			</thead>
			
			<%
			int no = 1;
			for(DataOfMarks data : list){ %>
			
			<tbody>
				<tr>
					<th scope="row"><%=no++ %></th>
					<td><%=data.getName() %></td>
					<td><%=data.getMarks() %></td>
				</tr>
			</tbody>
			
			<%} %>
		</table>

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