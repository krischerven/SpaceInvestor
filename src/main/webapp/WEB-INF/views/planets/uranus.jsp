<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Uranus</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/spacestyle.css">
</head>
<body>
	<h1>Uranus</h1>
	<br>
	<table>
		<tr>
			<td><img src=${planet.gifImage }
				style="width: 350px; height: 300px;"></td>
			<td>
				<table>
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

				<table>
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
				<p>Let's send a probe to Uranus! I know what you're thinking,
					get your mind out of the gutter we're about to get serious. If your
					favorite color is blue then this is the Planet for you. Uranus is
					made of water, methane, and ammonia fluids above a small rocky
					center. The atmosphere is made of hydrogen and helium making it the
					perfect opportunity to open up your very own glactic balloon store.
					Everything from hot air balloons to balloons for your kid's
					birthday party Uranus has the helium you need. You won't have to
					pay for any of the helium and you can sell it all, what a
					magnificent business plan? Selling something you get for free?
					Something really wrong would have to be wrong with you to not get
					your hands on this opportunity.
	</table>
	</table>

</body>
</html>