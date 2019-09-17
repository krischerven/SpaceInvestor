<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Land In Space</title>
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
</head>
<body>
	<input type="button" class="btn btn-primary" value="Create User"
		onclick="window.location='../create-user'" />
	<input type="button" class="btn btn-primary" value="Login"
		onclick="window.location='../login'" />
	<br>
	<br>
	<h1>My Land In Space</h1>
	<br>
	<!-- The Bootstrap grid system has four classes: xs (phones), sm (tablets), md (desktops), and lg (larger desktops). The classes can be combined to create more dynamic and flexible layouts. -->
	<div class="container-fluid d-none d-md-block">
		<div class="row">
			<div class="col-lg-4">
				<p>
				 <c:forEach var="land" items="${first}">
				 	${land}
				 	<br><br>
				 </c:forEach>
				 </p>
			</div>
			<div class="col-lg-4">
				<p>
				 <c:forEach var="planet" items="${second}">
				 	${planet}
				 	<br><br>
				 </c:forEach>
				 </p>
			</div>
			<div class="col-lg-4">
				<p>
				 <c:forEach var="land" items="${third}">
				 	${land}
				 	<br><br>
				 </c:forEach>
				 </p>
			</div>
		</div>
	</div>
	<div class="d-md-none">
		<div class="row">
			<div class="col-lg-12">
				<p>
				 <c:forEach var="land" items="${all}">
				 	${land.toStringCentered()}
				 	<br><br>
				 </c:forEach>
				 </p>
			</div>
		</div>
	</div>
</body>