<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Land In Space</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/spacestyle.css">
<style>
#footer{
	margin-top: 8%;
}
</style>
</head>
<body>
	<input type="button" class="btn btn-primary hBack"
		value="<- Return to Index" onclick="window.location='/'" />
	<input type="button" class="btn btn-primary" value="Create User"
		onclick="window.location='../create-user'" />
	<input type="button" class="btn btn-primary" value="Login"
		onclick="window.location='../login'" />
	
	<h1 id="placeholder"></h1>
	<h2 id="error" style="color: #FF0000"></h2>
	
	<div class="container-fluid d-none d-md-block" id="div1" style="display: none">
		<div class="row">
			<div class="col-lg-4">
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
			<div class="col-lg-4">
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
			<div class="col-lg-4">
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
	
	<p id="test" style="display: none">${first}${all}</p>
	<div id="footer">
	<footer class="footer-planet">
		<small>&copy; Copyright 2019, SpaceInvestors. All Rights
			Reserved</small>
	</footer>
	</div>
	
	<script>
		function getCookie(name) {
			let value = "; " + document.cookie;
			let parts = value.split("; " + name + "=");
			if (parts.length == 2) return parts.pop().split(";").shift();
		}
		// test <p> will be "[][Ljava.lang.Object;@4616781a" (two arrays) or better if auth was sucessful
		if (document.cookie.indexOf('authenticated=') != -1 && document.getElementById("test").innerText !== "") {
			document.getElementById("placeholder").innerText = "Your Land In Space";
			document.getElementById("div1").style.display = "block";
		} else {
			document.getElementById("error").innerText = "ERROR: You must log in to see your purchased land."
		}
	</script>

</body>
</html>