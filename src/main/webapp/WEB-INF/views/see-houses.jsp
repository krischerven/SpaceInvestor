<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/spacestyle.css">
</head>
<body>
	<input type="button" class="btn btn-primary hBack"
		value="<- Return to Index" onclick="window.location='/'" />
	<input type="button" class="btn btn-primary" value="Create User"
		onclick="window.location='../create-user'" />
	<input type="button" class="btn btn-primary" value="Login"
		onclick="window.location='../login'" />
	
	<h1 id="placeholder">ERROR</h1>
	
	<div class="container-fluid d-none d-md-block" id="div1" style="display: none">
		<div class="row">
			<div class="col-lg-4" align="center">
				<p>
				 <c:forEach var="house" items="${first}">
					<center>
					<img src=${house.houseImage } style="width: 600px; height: 450px; image-align: center;">
					</center>
					<ul>
						<li>Location: ${house.planetName }</li>
						<li>Acres: ${house.arces }</li>
						<li>Property Details: ${house.propertyDetails }</li>
						<li>House Features: ${house.houseFeatures }</li>
						<li>Architectural Style: ${house.architecturalStyle }</li>
					</ul>
				 	<br><br>
				 </c:forEach>
				 </p>
			</div>
			<div class="col-lg-4" align="center">
				<p>
				 <c:forEach var="house" items="${second}">
					<center>
					<img src=${house.houseImage } style="width: 600px; height: 450px; image-align: center;">
					</center>
					<ul>
						<li>Location: ${house.planetName }</li>
						<li>Acres: ${house.arces }</li>
						<li>Property Details: ${house.propertyDetails }</li>
						<li>House Features: ${house.houseFeatures }</li>
						<li>Architectural Style: ${house.architecturalStyle }</li>
					</ul>
				 	<br><br>
				 </c:forEach>
				 </p>
			</div>
			<div class="col-lg-4" align="center">
				<p>
				 <c:forEach var="house" items="${third}">
					<center>
					<img src=${house.houseImage } style="width: 600px; height: 450px; image-align: center;">
					</center>
					<ul>
						<li>Location: ${house.planetName }</li>
						<li>Acres: ${house.arces }</li>
						<li>Property Details: ${house.propertyDetails }</li>
						<li>House Features: ${house.houseFeatures }</li>
						<li>Architectural Style: ${house.architecturalStyle }</li>
					</ul>
				 	<br><br>
				 </c:forEach>
				 </p>
			</div>
		</div>
	</div>
	<div class="d-md-none">
		<div class="row">
			<div class="col-lg-12" align="center">
				<p>
				 <c:forEach var="house" items="${all}">
					<center>
					<img src=${house.houseImage } style="width: 600px; height: 450px; image-align: center;">
					</center>
					<ul>
						<li>Location: ${house.planetName }</li>
						<li>Price: ${house.price }</li>
						<li>Acres: ${house.arces }</li>
						<li>Property Details: ${house.propertyDetails }</li>
						<li>House Features: ${house.houseFeatures }</li>
						<li>Architectural Style: ${house.architecturalStyle }</li>
					</ul>
				 	<br><br>
				 </c:forEach>
				 </p>
			</div>
		</div>
	</div>
	
	<script>
		function getCookie(name) {
			let value = "; " + document.cookie;
			let parts = value.split("; " + name + "=");
			if (parts.length == 2) return parts.pop().split(";").shift();
		}
		if (document.cookie.indexOf('authenticated=') != -1) {
			document.getElementById("placeholder").innerText = "Your Land";
			document.getElementById("div1").style.display = "block";
		} else {
			document.getElementById("placeholder").innerText = "Error: Please log in to see your puchased land!"
		}
	</script>

	<footer>
		<small>&copy; Copyright 2019, SpaceInvestors. All Rights
			Reserved</small>
	</footer>
</body>
</html>