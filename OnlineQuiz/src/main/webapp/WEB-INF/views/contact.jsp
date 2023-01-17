<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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

<style type="text/css">
.footer-dark {
	padding: 50px 0;
	color: #f0f9ff;
	background-color: #282d32;
}

.footer-dark h3 {
	margin-top: 0;
	margin-bottom: 12px;
	font-weight: bold;
	font-size: 16px;
}

.footer-dark ul {
	padding: 0;
	list-style: none;
	line-height: 1.6;
	font-size: 14px;
	margin-bottom: 0;
}

.footer-dark ul a {
	color: inherit;
	text-decoration: none;
	opacity: 0.6;
}

.footer-dark ul a:hover {
	opacity: 0.8;
}

@media ( max-width :767px) {
	.footer-dark .item:not(.social) {
		text-align: center;
		padding-bottom: 20px;
	}
}

.footer-dark .item.text {
	margin-bottom: 36px;
}

@media ( max-width :767px) {
	.footer-dark .item.text {
		margin-bottom: 0;
	}
}

.footer-dark .item.text p {
	opacity: 0.6;
	margin-bottom: 0;
}

.footer-dark .item.social {
	text-align: center;
}

@media ( max-width :991px) {
	.footer-dark .item.social {
		text-align: center;
		margin-top: 20px;
	}
}

.footer-dark .item.social>a {
	font-size: 20px;
	width: 36px;
	height: 36px;
	line-height: 36px;
	display: inline-block;
	text-align: center;
	border-radius: 50%;
	box-shadow: 0 0 0 1px rgba(255, 255, 255, 0.4);
	margin: 0 8px;
	color: #fff;
	opacity: 0.75;
}

.footer-dark .item.social>a:hover {
	opacity: 0.9;
}

.footer-dark .copyright {
	text-align: center;
	padding-top: 24px;
	opacity: 0.3;
	font-size: 13px;
	margin-bottom: 0;
}

</style>

<title>Contact Us</title>
</head>
<body>

	<%@include file="base.jsp"%>
	<%@include file="navbar.jsp"%>
	<%@include file="baseCss.jsp"%>

	<div class="bigimg">

		<br>
		<div align="center">

			<h2 style="color: white; margin-top: 5%;">Contact Us</h2>

			<form:form action="contactHandler" modelAttribute="cont">

				<div class="form-row" style="margin-top: 2%;">
					<div class="col-md-4 mb-3">
						<input style="margin-left: 50%;" type="text" class="form-control"
							id="validationCustom01" placeholder="First name"
							required="required" name="fname">
						<div class="valid-feedback" style="color: white;">Looks
							good!</div>
					</div>
					<div class="col-md-4 mb-3">
						<input style="margin-left: 51%;" type="text" class="form-control"
							id="validationCustom02" placeholder="Last name"
							required="required" name="lname">
						<div class="valid-feedback" style="color: white;">Looks
							good!</div>
					</div>

					<div class="form-group col-md-6">
						<input type="email" style="width: 66%; margin-left: 32.5%;"
							class="form-control" id="inputEmail4"
							placeholder="Enter Email Address" name="email"
							required="required">
					</div>
					<div class="form-group col-md-6">
						<input style="width: 66%; margin-right: 40%;" type="text"
							class="form-control" id="inputPassword4"
							placeholder="Enter Mobile Number" name="phone"
							required="required">
					</div>

					<div class="form-group">
						<input style="margin-left: 125%; width: 495%;" type="text"
							class="form-control" id="inputAddress" placeholder="Address"
							name="address">
					</div>

					<div class="form-group">
						<input style="margin-left: 25%; width: 495%; margin-top: 26.5%;"
							type="text" class="form-control" id="inputAddress"
							placeholder="Message" name="message">
					</div>


				</div>

				<button type="submit" class="btn btn-danger">Submit</button>

			</form:form>

		</div>

	</div>

	<div class="footer-dark">
		<footer>
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-md-3 item">
						<h3>Services</h3>
						<ul>
							<li><a href="#">Web design</a></li>
							<li><a href="#">Development</a></li>
							<li><a href="#">Hosting</a></li>
						</ul>
					</div>
					<div class="col-sm-6 col-md-3 item">
						<h3>About</h3>
						<ul>
							<li><a href="#">Company</a></li>
							<li><a href="#">Team</a></li>
							<li><a href="#">Careers</a></li>
						</ul>
					</div>
					<div class="col-md-6 item text">
						<h3>Pradeep Biswas</h3>
						<p>Praesent sed lobortis mi. Suspendisse vel placerat ligula.
							Vivamus ac sem lacus. Ut vehicula rhoncus elementum. Etiam quis
							tristique lectus. Aliquam in arcu eget velit pulvinar dictum vel
							in justo.</p>
					</div>
				</div>
				<p class="copyright">
					Quiz Show © 2022<b style="margin-left: 4%;">Version 0.0.1</b>
				</p>
			</div>
		</footer>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>
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