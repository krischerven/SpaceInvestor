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
<link rel="stylesheet" href="css/spacestyle.css">
</head>
<body>
	<table>
		<tr>
			<th>Price</th>
			<th>Acres</th>
			<th>Year Built</th>
			<th>Condition</th>
		</tr>
		<tr>
			<td>${house.price }</td>
			<td>${house.arces }</td>
			<td>${house.yearBuilt }</td>
			<td>${house.condition }</td>
		</tr>
	</table>
	<table>
		<tr>
			<th>Property Details</th>
			<th>House Features</th>
			<th>Architectural Style</th>
		</tr>
		<tr>
			<td>${house.propertyDetails }</td>
			<td>${house.houseFeatures }</td>
			<td>${house.architecturalStyle }</td>
		</tr>
	</table>

</body>
</html>