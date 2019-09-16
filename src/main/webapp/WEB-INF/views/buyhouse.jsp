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
	<h2 id="placeholder">ERROR</h2>
	<div id="div1" style="display: none">
		<p>This is the details of your purchase</p>
		<ul>
			<li>Price: ${house.price }</li>
			<li>Acres: ${house.arces }</li>
			<li>Property Details: ${house.propertyDetails }</li>
			<li>House Features: ${house.houseFeatures }</li>
			<li>Architectural Style: ${house.architecturalStyle }</li>
		</ul>
	</div>
	<script>
		if (document.cookie.indexOf('authenticated=') != -1) {
			document.getElementById("placeholder").innerText = "You just bought your first house on ${house.planet.planetName}!"
			document.getElementById("div1").style.display = "block";
		} else {
			document.getElementById("placeholder").innerText = "Error: Please log in to purchase a planet!"
		}
	</script>

</body>
</html>