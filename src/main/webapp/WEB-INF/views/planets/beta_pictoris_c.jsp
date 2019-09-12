<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Beta Pictoris C</title>
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
	<h1>Beta Pictoris C</h1>
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
	<p>Beta Pictoris C wasn't enough for you I see. Listen we get it,
		you're a super loner who loves reading books all day and enjoying life
		alone. You're not a loner, you say? You hate being a lone but you just
		hate being around other people...Oh I see, look, you and your 9 cats
		are more than welcome on Beta Pictoris C. This planet will have you as
		isolated as possible. It's 9 times the size of Jupiter. For those
		people who live in major cities and want to get away from people,
		cars, and polluted air for a while, now is your opportunity to buy a
		vacation home away from all of the noise. You might run into weirdos
		with 9 cats if you really try, but other than that this planet will
		not have many natives or others living around your vacation home if
		you choose not to.</p>
</body>
</html>