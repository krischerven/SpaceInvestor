<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jupiter</title>
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
	<h1>Jupiter</h1>
	<br>
	<table>
		<tr>
			<td><img src=${planet.gifImage }
				style="width: 350px; height: 300px;"></td>
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
						<td>${planet.minTemp }</td>
						<td>${planet.maxTemp }</td>
					</tr>
				</table>
	</table>

	<p>No, going to Jupiter will in fact not make you more stupider.
		There is no better opportunity to open your honeymoon resort than
		right now on this planet of all planets. Imagine being able to kiss
		the love of your life not under the stars and ONE moon but under the
		stars and SEVENTY FIVE whole moons. Now if that's not romantic I don't
		know what is. Valentine's day will have this planet packed and create
		opportunities for your wallets to get nice and hefty. When one couple
		puts up a picture of their anniversary celebration under Jupiter's 75
		moons on Instagram, every woman on earth will be envious and every man
		on earth will have to step up their game. CHA CHING. Time to make that
		bank baby, but resorts here are going up fast so be one of the first
		to secure your resort's place on this beautiful planet.</p>
	
	<p id="xPoints_1" hidden=true>${jupiterGraph1.getXPoints()}</p>
	<p id="yPoints_1" hidden=true>${jupiterGraph1.getYPoints()}</p>
	<p id="title_1" hidden=true>${jupiterGraph1.titleName}</p>
	<p id="xName_1" hidden=true>${jupiterGraph1.xName}</p>
	<p id="yName_1" hidden=true>${jupiterGraph1.yName}</p>

	<div class="container" id="graph1">
		<!-- Graph #1 goes here -->
	</div>

	<!--  JS that actually creates the graphs -->
	<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
	<script type="text/javascript" src="../scripts/graphs/line1.js"></script>
	
</body>
</html>