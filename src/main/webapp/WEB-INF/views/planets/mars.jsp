<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mars</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/spacestyle.css">
</head>
<body>
	<input type="button" class="btn btn-primary hBack" value="<- Return to Index" onclick="window.location='/'" />
	<h1>Mars</h1>
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
						<td>${planet.minTemp }</td>
						<td>${planet.maxTemp }</td>
					</tr>

				</table> <br>
	</table>
	<p>Elon Musk, this one is for you! Other than Tesla Dealerships
		everywhere, this planet will be the best of all planets to raise a
		family. Mars is like one huge bouncy house with 62.5% less gravity.
		Jump around the sand dunes and enjoy the nice Earth like
		temperatures(some days). Make sure to bring extra blankets and coats
		because temperatures on Mars can get as low as -284 degrees. But hey
		kids, more snow days! The adults can enjoy those cold days in front of
		the fireplace with a warm cup of coffee and Earth Football on all day.
		What a life? If you want to miss out on an opportunity like this then
		go ahead, browse another website, the Martians won't miss you.</p>
		<br>
		<input type = "button" class = "btn btn-primary" value = "Create User" onclick = "window.location='../create-user'" />
		
<p id="xPoints_1" hidden=true>${marsGraph1.getXPoints()}</p>
<p id="yPoints_1" hidden=true>${marsGraph1.getYPoints()}</p>

<div class="container" id="graph1">
<!-- Graph #1 goes here -->
</div>

<!--  JS that actually creates the graphs -->
<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
<script type="text/javascript" src="../scripts/mars_graph1.js"></script>

</body>
</html>