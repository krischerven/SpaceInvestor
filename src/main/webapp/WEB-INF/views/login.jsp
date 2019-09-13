<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log Into Your Account</title>
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
	<h2>Log into your account to start buying planets today!</h2>
	<br>
	<form action="/logged-in">
		<input type="text" name="email" placeholder="Email Address"
			pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" maxLength="50"
			style="width: 250px;" required /> <input type="password" name="password"
			placeholder="Password" pattern="[A-Za-z]{0,12}" maxLength="50"
			style="width: 250px;" required /> <input type="submit" value="SUBMIT"
			class="btn btn-primary" />
	</form>
</body>
</html>
<!--

<form action="search-person-id" method="post">
	<input type="text" name="id" placeholder="ID"/>
	<input type="submit" value="Search Person" class="btn btn-primary"/>
</form>-->