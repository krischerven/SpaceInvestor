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

#section3 {
	padding-top: 50px;
	height: 100%;
	width: 75%
}
</style>
</head>
<body>
<body data-spy="scroll" data-target=".changer" data-offset="50">
	<input type="button" class="btn btn-primary hBack"
		value="<- Return to Index" onclick="window.location='/'" />
	<input type="button" class="btn btn-primary" value="Create User"
		onclick="window.location='../create-user'" />
	<div id="section1" class="container-fluid">
		<h1>${planet.getTitle()}</h1>
		<br>
		<table>
			<tr>
				<td><img src=${planet.gifImage }
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
							<td>${planet.minTemp}</td>
							<td>${planet.maxTemp}</td>
						</tr>
					</table>
		</table>
		<p>Venus, a planet soon to be filled with four wheelers and dirt
			bikes. If you want to live your days riding four wheelers and dirt
			bikes then Venus is the planet for you. It is a hot planet with
			minimal water so be sure to bring a water bottle. Its landscape is
			mainly made up of sand, sand dunes, and volcanoes. But hey, don't let
			the volacanoes intimidate you. Once you get the hang of riding your
			four wheelers and dirt bikes around the lava it won't be that bad.
			It'll be like a video game you play in real life. Tell Mark
			Zuckerberg his Oculus headsets will be of no value on this planet. If
			you want to be a wimp and play games in a FAKE world then the Oculus
			is for you. Now, if you are a champ and want to take the experiences
			of Mario Kart to the real world, then Venus is for you.</p>
	</div>
	<div id="section2" class="container-fluid">
		<h1>Houses</h1>
		<br>
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
			value="Buy House" onclick="window.location='../buyhouse?house=venus'" />
	</div>
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
	</div>

	<!--  JS that actually creates the graphs -->
	<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/numeral.js/2.0.6/numeral.min.js"></script>
	<script type="text/javascript" src="../scripts/graphs/line1.js"></script>
</body>
</html>