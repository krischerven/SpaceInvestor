<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Venus</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/spacestyle.css">
</head>
<body>
	<input type="button" class="btn btn-primary hBack" value="<- Return to Index" onclick="window.location='/'" />
	<h1>Venus</h1>
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
				</table>
	</table>

	<p>Venus, a planet soon to be filled with four wheelers and dirt
		bikes. If you want to live your days riding four wheelers and dirt
		bikes then Venus is the planet for you. It is a hot planet with
		minimal water so be sure to bring a water bottle. Its landscape is
		mainly made up of sand, sand dunes, and volcanoes. But hey, don't let
		the volacanoes intimidate you. Once you get the hang of riding your
		four wheelers and dirt bikes around the lava it won't be that bad.
		It'll be like a video game you play in real life. Tell Mark Zuckerberg
		his Oculus headsets will be of no value on this planet. If you want to
		be a wimp and play games in a FAKE world then the Oculus is for you.
		Now, if you are a champ and want to take the experiences of Mario Kart
		to the real world, then Venus is for you.</p>
		<br>
		<input type = "button" class = "btn btn-primary" value = "Create User" onclick = "window.location='../create-user'" />
		
</body>
</html>