<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${planet.getIndexTitle()}</title>
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
	width: 75%;
}
</style>
</head>
<main>
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
		<p>If you like it, then you should of put a ring on it!
			Vacationing on Saturn is out of this world. Be the first to fully
			commit your hotel business on this exotic planet. Your guests will be
			able to view Saturn's rings in person as they hold their place in the
			atmosphere above them. If you think the Grand Canyon is cool wait
			until you see the rocky surface of good old Saturn. Not only is the
			surface made up of rocks it is also covered in ice that is structured
			in ways that are unimaginable. You really have to see it to believe
			it.</p>
	</div>
	<div id="section2" class="container-fluid">
		<h1>Houses</h1>
		<table>
			<tr>
				<td><img src=${house.houseImage }
					style="width: 425px; height: 350px; border: solid;"></td>
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
			onclick="window.location='../buyhouse?house=SATURN'" /> <br> <br>
		<table>
			<tr>
				<td><img src=${house2.houseImage }
					style="width: 350px; height: 350px; border: solid;"></td>
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
			onclick="window.location='../buyhouse?house=SATURN2'" /> <br> <br>
		<table>
			<tr>
				<td><img src=${house3.houseImage }
					style="width: 350px; height: 350px; border: solid;"></td>
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
			onclick="window.location='../buyhouse?house=SATURN3'" />
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
		<p>With the price of Helium going up on Saturn now is the time for
			you to get your balloon business started before those guys on Uranus
			find an actual solid surface to land on.</p>
		
	</div>
	<br>
	<br>

	<!--  JS that actually creates the graphs -->
	<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/numeral.js/2.0.6/numeral.min.js"></script>
	<script type="text/javascript" src="../scripts/graphs/line1.js"></script>

	<!--  misc JS code -->
	<script type="text/javascript" src="../scripts/helpers/helpers.js"></script>

</body>

		<footer class="footer-planet">
			<small>&copy; Copyright 2019, SpaceInvestors. All Rights
				Reserved</small>
		</footer>
</main>
</html>