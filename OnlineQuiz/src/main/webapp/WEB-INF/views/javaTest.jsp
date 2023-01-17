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

	label{
		color: white;
	}
	
	.onlyQuiz{
		background-color: #919eb3;
	}

</style>

<title>Java Quiz!</title>
</head>
<body>

	<!-- https://www.sanfoundry.com/java-questions-answers-concepts-oops/ -->

	<%@include file="base.jsp"%>


	<div align="center" class = "onlyQuiz">
	<br><br>
		<h2 align="center" style="color: white;">java Quiz</h2>
		<form:form action="quizAnswerHandler" method="POST"
			modelAttribute="quizHandler">

			<!-- First Question -->

			<div class="form-check">
				<h3 style="margin-right: 8.5%; margin-top: 2%;">
					<label>1. Can we have two main methods in a java class?</label>
				</h3>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="Yes" id="defaultCheck1" name="q1">
					<h5>
						<label class="form-check-label" for="defaultCheck1">Yes</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="No"
						id="defaultCheck4" name="q1">
					<h5>
						<label class="form-check-label" for="defaultCheck4">No</label>
					</h5>
				</div>

			</div>
			<br>

			<!-- Second Question -->

			<div class="form-check">
				<h3 style="margin-left: 8%;">
					<label>2. Which data type is used to create a variable that
						should store text?</label>
				</h3>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="Character"
						id="s1" name="q2">
					<h5>
						<label class="form-check-label" for="s1">Character</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="String"
						id="s2" name="q2">
					<h5>
						<label class="form-check-label" for="s2">String</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="Boolean"
						id="s3" name="q2">
					<h5>
						<label class="form-check-label" for="s3">Boolean</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="ArrayList"
						id="s4" name="q2">
					<h5>
						<label class="form-check-label" for="s4">ArrayList</label>
					</h5>
				</div>

			</div>
			<br>

			<!-- third Question -->

			<div class="form-check">
				<h3>
					<label>3. Which method can be used to find the length of a
						string?</label>
				</h3>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="len()"
						id="t1" name="q3">
					<h5>
						<label class="form-check-label" for="t1">len()</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="sizeOf()"
						id="t2" name="q3">
					<h5>
						<label class="form-check-label" for="t2">sizeOf()</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="lenght()"
						id="t3" name="q3">
					<h5>
						<label class="form-check-label" for="t3">lenght()</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="lenght"
						id="t4" name="q3">
					<h5>
						<label class="form-check-label" for="t4">lenght</label>
					</h5>
				</div>

			</div>
			<br>

			<!-- forth Question -->

			<div class="form-check">
				<h3 style="margin-right: 4%;">
					<label>4. Which of the following is not OOPS concept in
						Java?</label>
				</h3>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Polymorphism" id="f1" name="q4">
					<h5>
						<label class="form-check-label" for="f1">Polymorphism</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="Compilation"
						id="f2" name="q4">
					<h5>
						<label class="form-check-label" for="f2">Compilation</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Encapsulation" id="f3" name="q4">
					<h5>
						<label class="form-check-label" for="f3">Encapsulation</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="Inheritance"
						id="f4" name="q4">
					<h5>
						<label class="form-check-label" for="f4">Inheritance</label>
					</h5>
				</div>

			</div>
			<br>

			<!-- fifth Question -->

			<div class="form-check">
				<h3 style="margin-left: 20%;">
					<label>5. Which concept of Java is a way of converting real
						world objects in terms of class?</label>
				</h3>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Polymorphism" id="ff1" name="q5">
					<h5>
						<label class="form-check-label" for="ff1">Polymorphism</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="Abstraction"
						id="ff2" name="q5">
					<h5>
						<label class="form-check-label" for="ff2">Abstraction</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Encapsulation" id="ff3" name="q5">
					<h5>
						<label class="form-check-label" for="ff3">Encapsulation</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="Inheritance"
						id="ff4" name="q5">
					<h5>
						<label class="form-check-label" for="ff4">Inheritance</label>
					</h5>
				</div>

			</div>
			<br>

			<!-- sixth Question -->

			<div class="form-check">
				<h3 style="margin-right: 35%;">
					<label>6. Array can hold?</label>
				</h3>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Only Primitive values" id="sx1" name="q6">
					<h5>
						<label class="form-check-label" for="sx1">Only Primitive
							values</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Only Object type values" id="sx2" name="q6">
					<h5>
						<label class="form-check-label" for="sx2">Only Object type
							values</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Both Primitive & Objects type values" id="sx3" name="q6">
					<h5>
						<label class="form-check-label" for="sx3">Both Primitive &
							Objects type values</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="None of these" id="sx4" name="q6">
					<h5>
						<label class="form-check-label" for="sx4">None of these</label>
					</h5>
				</div>

			</div>
			<br>

			<!-- seventh Question -->

			<div class="form-check">
				<h3 style="margin-right: 14%;">
					<label>7. Map(I) and its subclasses are meant for?</label>
				</h3>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Represent a group of individual objects." id="sv1"
						name="q7">
					<h5>
						<label class="form-check-label" for="sv1">Represent a
							group of individual objects.</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Represent a group of objects as key-value pairs" id="sv2"
						name="q7">
					<h5>
						<label class="form-check-label" for="sv2">Represent a
							group of objects as key-value pairs.</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Both (a) and (b)" id="sv3" name="q7">
					<h5>
						<label class="form-check-label" for="sv3">Both (a) and (b)</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="None of these" id="sv4" name="q7">
					<h5>
						<label class="form-check-label" for="sv4">None of these</label>
					</h5>
				</div>

			</div>
			<br>

			<!-- eight Question -->

			<div class="form-check">
				<h3 style="margin-right: 3.5%;">
					<label>8. What is the default relation b/w Thread &
						Runnable?</label>
				</h3>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Thread extends Runnable" id="e1" name="q8">
					<h5>
						<label class="form-check-label" for="e1">Thread extends
							Runnable</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Thread implements Runnable" id="e2" name="q8">
					<h5>
						<label class="form-check-label" for="e2">Thread implements
							Runnable</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="They are not related" id="e3" name="q8">
					<h5>
						<label class="form-check-label" for="e3">They are not
							related</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Runnable extends Thread" id="e4" name="q8">
					<h5>
						<label class="form-check-label" for="e4">Runnable extends
							Thread</label>
					</h5>
				</div>

			</div>
			<br>

			<!-- ninth Question -->

			<div class="form-check">
				<h3 style="margin-right: 14.5%;">
					<label>9. What is the default priority of a thread?</label>
				</h3>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="5" id="n1"
						name="q9">
					<h5>
						<label class="form-check-label" for="n1">5</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="2" id="n2"
						name="q9">
					<h5>
						<label class="form-check-label" for="n2">2</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="4" id="n3"
						name="q9">
					<h5>
						<label class="form-check-label" for="n3">4</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio" value="1" id="n4"
						name="q9">
					<h5>
						<label class="form-check-label" for="n4">1</label>
					</h5>
				</div>

			</div>
			<br>

			<!-- tenth Question -->

			<div class="form-check">
				<h3 style="margin-right: 14.5%;">
					<label>10. Quick sort algorithm is an example of ?</label>
				</h3>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Divide and conquer" id="tt1" name="q10">
					<h5>
						<label class="form-check-label" for="tt1">Divide and
							conquer</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Dynamic Programming" id="tt2" name="q10">
					<h5>
						<label class="form-check-label" for="tt2">Dynamic
							Programming</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Improved binary search" id="tt3" name="q10">
					<h5>
						<label class="form-check-label" for="tt3">Improved binary
							search</label>
					</h5>
				</div>
				<div align="left" style="margin-left: 27%;">
					<input class="form-check-input" type="radio"
						value="Greedy approach" id="tt4" name="q10">
					<h5>
						<label class="form-check-label" for="tt4">Greedy approach</label>
					</h5>
				</div>

			</div>
			<br>

			<button type="submit" class="btn btn-outline-warning"
				style="margin-bottom: 1%;">Submit</button>

		</form:form>
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