<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>47 Uma B</title>
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

#section3 {
	padding-top: 600px;
	height: 100%;
	width: 75%
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
	<input type="button" class="btn btn-primary" value="See Properties"
		href="#" onclick="seeHouses();" />
	<div id="section1" class="container-fluid">
		<h1>${planet.getTitle()}</h1>
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

		<p>47 Uma B is an exoplanet that is not only out of this world but
			out of this solar system! It is 45.9 light years away and is 1.2
			times larger than the sun. I don't about you but that is huge! With
			so much space the possibilities are endless. You can finally build
			that race track that you've wanted or build a stadium for your
			favorite sports team. You can also build the largest party venue and
			throw parties that are quite literally out of this world. The hottest
			artists will want to be the first to host their concerts on another
			planet and will be lining up at your front door waiting for such a
			grand opportunity. If you can imagine it, then it is possible on 47
			Uma b. Whatever happens in 47 Uma B stays in 47 Uma B.</p>
	</div>

	<div id="section2" class="container-fluid">
		<h1>Houses</h1>
		<table>
			<tr>
				<td><img src=${house.houseImage }
					style="width: 350px; height: 350px;"></td>
				<td>
					<table>
						<tr>
							<ul>
								<li>Price: ${house.price }</li>
								<li>Acres: ${house.arces }</li>
								<li>Year Built: ${house.yearBuilt }</li>
								<li>Condition: ${house.condition }</li>
								<li>Property Details: ${house.propertyDetails }</li>
								<li>House Features: ${house.houseFeatures }</li>
								<li>Architectural Style: ${house.architecturalStyle }</li>
							</ul>
						</tr>
					</table>
		</table>
		<br> <input type="button" class="btn btn-primary hBack"
			value="Buy House"
			onclick="window.location='../buyhouse?house=_47_UMA_B'" /> <br>
		<br>
		<table>
			<tr>
				<td><img src=${house2.houseImage }
					style="width: 350px; height: 350px;"></td>
				<td>
					<table>
						<tr>
							<ul>
								<li>Price: ${house2.price }</li>
								<li>Acres: ${house2.arces }</li>
								<li>Year Built: ${house2.yearBuilt }</li>
								<li>Condition: ${house2.condition }</li>
								<li>Property Details: ${house2.propertyDetails }</li>
								<li>House Features: ${house2.houseFeatures }</li>
								<li>Architectural Style: ${house2.architecturalStyle }</li>
							</ul>
						</tr>
					</table>
		</table>
		<br> <input type="button" class="btn btn-primary hBack"
			value="Buy House"
			onclick="window.location='../buyhouse?house=_47_UMA_B2&auth=${blah}'" />
		<br> <br>
		<table>
			<tr>
				<td><img src=${house3.houseImage }
					style="width: 350px; height: 350px;"></td>
				<td>
					<table>
						<tr>
							<ul>
								<li>Price: ${house3.price }</li>
								<li>Acres: ${house3.arces }</li>
								<li>Year Built: ${house3.yearBuilt }</li>
								<li>Condition: ${house3.condition }</li>
								<li>Property Details: ${house3.propertyDetails }</li>
								<li>House Features: ${house3.houseFeatures }</li>
								<li>Architectural Style: ${house3.architecturalStyle }</li>
							</ul>
						</tr>
					</table>
		</table>
		<br> <input type="button" class="btn btn-primary hBack"
			value="Buy House"
			onclick="window.location='../buyhouse?house=_47_UMA_B3'" />
		<!-- graph section -->
		<p id="xPoints_1" hidden=true>${graph1.getXPoints()}</p>
		<p id="yPoints_1" hidden=true>${graph1.getYPoints()}</p>
		<p id="title_1" hidden=true>${graph1.titleName}</p>
		<p id="xName_1" hidden=true>${graph1.xName}</p>
		<p id="yName_1" hidden=true>${graph1.yName}</p>

		<div id="section3" class="container-fluid">
			<h1>Graphs</h1>
			<br>
			<div id="graph1">
				<!-- Graph #1 goes here -->
			</div>
			<p>With the temperatures of Earth dangerously rising, you must
				secure your spot on this earth life planet. Or most comparable to
				planet Earth. Think about your family and their future. Don't you
				want them to be safe when the Earth no longer has a sustainable
				ecosystem for its species.</p>
		</div>
	</div>

	<!--  JS that actually creates the graphs -->
	<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/numeral.js/2.0.6/numeral.min.js"></script>
	<script type="text/javascript" src="../scripts/graphs/line1.js"></script>

	<!--  misc JS code -->
	<script type="text/javascript" src="../scripts/helpers/helpers.js"></script>

	<footer>
		<small>&copy; Copyright 2019, SpaceInvestors. All Rights
			Reserved</small>
	</footer>
</body>
</html>