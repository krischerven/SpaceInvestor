<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ERROR</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/spacestyle.css">
<style>
#footer{
	margin-top: 8%;
}
</style>
</head>
<body>
	<input type="button" class="btn btn-primary hBack"
		value="<- Return to Create User"
		onclick="window.location='create-user'" />
	<h2 style="color: #FF0000">Error: Invalid Credit Card Entry!</h2>
	<div id="footer">
	<footer class="footer-planet">
		<small>&copy; Copyright 2019, SpaceInvestors. All Rights
			Reserved</small>
	</footer>
	</div>
</body>
</html>