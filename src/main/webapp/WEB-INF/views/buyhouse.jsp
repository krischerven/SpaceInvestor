<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy Land In Space</title>
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
<main>
<body>
	<input type="button" class="btn btn-primary hBack"
		value="<- Return to Index" onclick="window.location='/'" />
	<input type="button" class="btn btn-primary" value="Create User"
		onclick="window.location='../create-user'" />
	<input type="button" class="btn btn-primary" value="Login"
		onclick="window.location='../login'" />
	<input type="button" class="btn btn-primary" value="See Properties"
		href="#" onclick="seeHouses();" />
	<h2 id="placeholder">ERROR</h2>
	<div id="div1" style="display: none">
		<p>Here are the details of your purchase:</p>
		<center>
			<img src=${house.houseImage }
				style="width: 600px; height: 450px; image-align: center; border: solid;">
		</center>
		<ul>
			<li>Price: ${house.price }</li>
			<li>Acres: ${house.arces }</li>
			<li>Property Details: ${house.propertyDetails }</li>
			<li>House Features: ${house.houseFeatures }</li>
			<li>Architectural Style: ${house.architecturalStyle }</li>
		</ul>
		
	</div>
	<script>
		function getCookie(name) {
			let value = "; " + document.cookie;
			let parts = value.split("; " + name + "=");
			if (parts.length == 2)
				return parts.pop().split(";").shift();
		}
		if (document.cookie.indexOf('authenticated=') != -1) {
			document.getElementById("placeholder").innerText = "You just bought your first house on ${house.planet.planetName}! Please wait to be returned to the home page as your purchase is finalized and submitted to the database..."
			document.getElementById("div1").style.display = "block";
			setTimeout(
					function() {
						window.location = 'save-user-land?house=${house.toString()}&auth='
								+ getCookie("authenticated");
					}, 2500);
		} else {
			document.getElementById("placeholder").innerText = "Error: Please log in to purchase a planet!"
		}
	</script>
	<!--  misc JS code -->
	<script type="text/javascript" src="../scripts/helpers/helpers.js"></script>

<div id="footer">
<footer class="footer-planet">
			<small>&copy; Copyright 2019, SpaceInvestors. All Rights
				Reserved</small>
		</footer>
		</div>
</body>
</main>
</html>