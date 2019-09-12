<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Europa</title>
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
	<h1>Europa</h1>
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

	<p>Show your loved one that you love them to the moon and back by
		buying property on Europa. If you and your loved one are fascinated by
		the view of Jupiter's moons, now is the chance to actually live on one
		of these beauties. Europa is the smallest of the 4 Galilean moons that
		orbit Jupiter. But you know what they say, great things come in small
		packages. Europa has the smoothest surface of any known solid object
		in our solar system. That means there will be no hills or mountains
		blocking your view of your loved one! On Europa you'll also have a
		wonderful view of Jupiter, anywhere you go. That way you can also keep
		your eyes on any properties you own there, if you are a big
		baller that is. If you're not a big baller then there is no place for
		you on this moon, sorry.</p>

	<p id="xPoints_1" hidden=true>${europaGraph1.getXPoints()}</p>
	<p id="yPoints_1" hidden=true>${europaGraph1.getYPoints()}</p>
	<p id="title_1" hidden=true>${europaGraph1.titleName}</p>
	<p id="xName_1" hidden=true>${europaGraph1.xName}</p>
	<p id="yName_1" hidden=true>${europaGraph1.yName}</p>

	<div class="container" id="graph1">
		<!-- Graph #1 goes here -->
	</div>

	<!--  JS that actually creates the graphs -->
	<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/numeral.js/2.0.6/numeral.min.js"></script>
	<script type="text/javascript" src="../scripts/graphs/line1.js"></script>

</body>
</html>