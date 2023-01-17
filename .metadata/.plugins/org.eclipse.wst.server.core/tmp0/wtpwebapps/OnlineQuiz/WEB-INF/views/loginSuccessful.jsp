<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>

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

<title>Login Successful</title>
</head>
<body>

	<%@include file="base.jsp"%>
	<%@include file="quizNavbar.jsp"%>
	<%@include file="baseCss.jsp"%>

	<div class="bigimg">
		<br>
		<div align="center" style="margin-top: 1%;">
			<h2 style="color: white; font-family: sans-serif; margin-left: 70%;">Hii
				${name}</h2>
		</div>
		<br>
		<div class="card"
			style="width: 18rem; margin-left: 2%; margin-top: 2%; background-color: #6e4c49">
			<div class="card-body">
				<h5 class="card-title" style="color: white">Java Quiz</h5>
				<p class="card-text" style="color: white">DSA, OOPS, Java Core,
					Collections, Thread concepts are included.</p>
				<a href="javaTest" class="btn btn-danger">Quiz</a>
			</div>
		</div>
		<div class="card"
			style="width: 18rem; margin-left: 2%; margin-top: 1px; background-color: #6e4c49;">
			<div class="card-body">
				<h4 class="card-title" style="color: white">Your Score</h4>
				<h5>
					<label class="card-text" style="color: white">${marks }</label>
				</h5>
			</div>
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
				<p class="copyright">Quiz Show © 2022<b style="margin-left: 4%;">Version 0.0.1</b></p>
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