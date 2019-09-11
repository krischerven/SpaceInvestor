<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cosmo/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-uhut8PejFZO8994oEgm/ZfAv0mW1/b83nczZzSwElbeILxwkN491YQXsCFTE6+nx"
	crossorigin="anonymous">
<meta charset="UTF-8">
<link rel="stylesheet" href="css/spacestyle.css">
<title>Space Real Estate Investor</title>
</head>
<body>
	<h1>Planet Investor Real Estate Professionals</h1>
	<br>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-4">
			
				<p>
					
				 <c:forEach var="planet" items="${first}">
				 	${planet}
				 </c:forEach>
				 </p>
			</div>
			<div class="col-lg-4">
				<p>
				 <c:forEach var="planet" items="${second}">
				 	${planet}
				 </c:forEach>
				 </p>
			</div>
			<div class="col-lg-4">
				<p>
				 <c:forEach var="planet" items="${third}">
				 	${planet}
				 </c:forEach>
				 </p>
			</div>
		</div>
	</div>
</body>
</html>