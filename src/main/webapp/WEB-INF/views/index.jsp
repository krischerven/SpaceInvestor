<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<meta charset="UTF-8">
<link rel="stylesheet" href="css/spacestyle.css">
<title>Space Real Estate Investor</title>
</head>
<body>
	<input type="button" class="btn btn-primary" value="Create User"
		onclick="window.location='../create-user'" />
	<input type="button" class="btn btn-primary" value="Login"
		onclick="window.location='../login'" />
	<input type="button" class="btn btn-primary" value="See Properties"
		href="#" onclick="seeHouses();" />
	<img src="images/qr2.png" alt="QR Code"
		style="width: 175px; height: 225px;" align="right" />

	<br>
	<h1>Space Investor's Real Estate Professionals</h1>
	<br>
	<!-- The Bootstrap grid system has four classes: xs (phones), sm (tablets), md (desktops), and lg (larger desktops). The classes can be combined to create more dynamic and flexible layouts. -->
	<div class="container-fluid d-none d-md-block">
		<div class="row">
			<div class="col-lg-4">
				<p>
					<c:forEach var="planet" items="${first}">
				 	${planet}
				 	<br>
						<br>
					</c:forEach>
				</p>
			</div>
			<div class="col-lg-4">
				<p>
					<c:forEach var="planet" items="${second}">
				 	${planet}
				 	<br>
						<br>
					</c:forEach>
				</p>
			</div>
			<div class="col-lg-4">
				<p>
					<c:forEach var="planet" items="${third}">
				 	${planet}
				 	<br>
						<br>
					</c:forEach>
				</p>
			</div>
		</div>
	</div>
	<div class="d-md-none">
		<div class="row">
			<div class="col-lg-12" align="center">
				<p>
					<c:forEach var="planet" items="${all}">
				 	${planet.toStringCentered()}
				 	<br>
						<br>
					</c:forEach>
				</p>
			</div>
		</div>
	</div>
	<!--  misc JS code -->
	<script type="text/javascript" src="../scripts/helpers/helpers.js"></script>
	<footer class="footer">
		<small>&copy; Copyright 2019, SpaceInvestors. All Rights
			Reserved</small>
	</footer>
</body>
</html>