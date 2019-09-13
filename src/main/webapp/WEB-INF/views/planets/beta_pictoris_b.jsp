<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${planet.getTitle()}</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/spacestyle.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
body {
	position: relative;
}

#section1 {
	padding-top: 50px;
	height: 100%;
}

#section2 {
	padding-top: 50px;
	height: 100%;
}
</style>
</head>
<body>
<body data-spy="scroll" data-offset="50">
	<input type="button" class="btn btn-primary hBack"
		value="<- Return to Index" onclick="window.location='/'" />
	<input type="button" class="btn btn-primary" value="Create User"
		onclick="window.location='../create-user'" />
	<input type="button" class="btn btn-primary" value="Login"
		onclick="window.location='../login'" />
	<h1>Beta Pictoris B</h1>
	<br>
	<table>
		<tr>
			<td><img src=${planet.imageUrl }
				style="width: 300px; height: 300px;"></td>
			<td>
				<table class="table space-table">
					<tr>
						<th>Star Name</th>
						<th>Star Distance</th>
						<th>Year Discovered</th>
						<th>Radius</th>
						<th>Period</th>
					</tr>
					<tr>
						<td>${planet.starName }</td>
						<td>${planet.starDistance }</td>
						<td>${planet.yearDiscovered }</td>
						<td>${planet.radius }</td>
						<td>${planet.period }</td>
					</tr>
				</table> <br>

				<table class="table space-table">
					<tr>
						<th>Mass</th>
						<th>Temperature Calculated</th>
						<th>Minimum Temperature</th>
						<th>Maximum Temperature</th>
					</tr>
					<tr>
						<td>${planet.mass }</td>
						<td>${planet.tempCalculated }</td>
						<td>nan</td>
						<td>nan</td>
					</tr>
				</table>
	</table>
	<p>Look if you thought Jupiter was something, then your going to
		love this exoplanet. Beta Pictoris B is considered the super Jupiter.
		The radius and mass of Beta Pictoris B are greater than that of
		Jupiter. Getting there might be more expensive but the properties are
		much more affordable. There is enough space for everybody to move
		here. But look the whole point of moving to an exoplanet is probably
		to get away from those annoying earthlings who do not value their own
		planet. Even if everybody in Earth moved to Beta Pictoris B you'd
		still have plenty of space to keep yourself isolated.</p>

	<div id="section2" class="container-fluid">
		<h1>Houses</h1>
		<ul>
			<li>Price: ${house.price }</li>
			<li>Acres: ${house.arces }</li>
			<li>Year Built: ${house.yearBuilt }</li>
			<li>Condition: ${house.condition }</li>
			<li>Property Details: ${house.propertyDetails }</li>
			<li>House Features: ${house.houseFeatures }</li>
			<li>Architectural Style: ${house.architecturalStyle }</li>
		</ul>
		<br> <input type="button" class="btn btn-primary hBack"
			value="Buy House"
			onclick="window.location='../buyhouse?house=betapicb'" />
	</div>
</body>
</html>