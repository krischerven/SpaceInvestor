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
		<p>This planet is one of the smallest gas planets to be discovered
			but double the size of earth. By many scientists it is considered a
			mini Neptune. This planet orbits around a red dwarf star. The star is
			called K2-3 and is cooler than the sun in our solar system The year
			is only 44 days on this planet and it was discovered in 2015. The
			Kepler Space Telescope found this planet while looking to discover
			exoplanets that are similar in size to Earth.</p>

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
				onclick="window.location='../buyhouse?house=K2_3_C'" /> <br> <br>
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
				onclick="window.location='../buyhouse?house=K2_3_C2'" /> <br>
			<br>
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
				onclick="window.location='../buyhouse?house=K2_3_C3'" />
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
				<p>With so much natural gas you can help power the universe.
					What an opportunity? The profits on this planet are unimaginable.
					Better get there before anybody else does.</p>
			</div>


		<!--  JS that actually creates the graphs -->
		<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
		<script
			src="//cdnjs.cloudflare.com/ajax/libs/numeral.js/2.0.6/numeral.min.js"></script>
		<script type="text/javascript" src="../scripts/graphs/line1.js"></script>
		
		<!--  misc JS code -->
		<script type="text/javascript" src="../scripts/helpers/helpers.js"></script>
</body>
</html>