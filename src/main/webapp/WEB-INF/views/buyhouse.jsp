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
	<h2 id="placeholder">REPLACEME</h2>
	<script>
	if (document.cookie.indexOf('authenticated=') != -1) {
		document.getElementById("placeholder").innerText = "You just bought your first house on ${house}!"
	} else {
		document.getElementById("placeholder").innerText = "Error: Please log in to purchase a planet!"
	}
	</script>
</body>
</html>