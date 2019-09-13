<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<meta charset="UTF-8">
<link rel="stylesheet" href="css/spacestyle.css">
<title>Space Real Estate Investor</title>
</head>
<body>
	<input type="button" class="btn btn-primary" value="Create User"
		onclick="window.location='../create-user'" />
	<input type="button" class="btn btn-primary" value="Login"
		onclick="window.location='../login'" />
	<br>
	<br>
	<h1>Planet Investor Real Estate Professionals</h1>
	<br>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-4">
			
				<p>
					
				 <c:forEach var="planet" items="${first}">
				 	${planet}
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
				 <c:forEach var="planet" items="${third}">
				 	${planet}
				 	<br><br>
				 </c:forEach>
				 </p>
			</div>
		</div>
	</div>
</body>
</html>