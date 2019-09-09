<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/spacestyle.css">
</head>
<body>
	<h1>Venus</h1>
	${planet}
	<br>

	<table>
		<tr>
			<th>Star Name</th>
			<th>Year Discovered</th>
			<th>Mass</th>
			<th>Radius</th>
			<th>Period</th>
			<th>Temperature Calculated</th>
			<th>Minimum Temperature</th>
			<th>Maximum Temperature</th>
			<th>Star Distance</th>
		</tr>
		<tr>
			<td>${planet.starName }</td>
			<td>${planet.yearDiscovered }</td>
			<td>${planet.mass }</td>
			<td>${planet.radius }</td>
			<td>${planet.period }</td>
			<td>${planet.tempCalculated }</td>
			<td>${planet.minTemp }</td>
			<td>${planet.maxTemp }</td>
			<td>${planet.starDistance }</td>
		</tr>
	</table>

</body>
</html>