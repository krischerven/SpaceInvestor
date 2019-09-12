<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create An Account</title>
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
	<h2>Create your Account to Start Investing in Properties That are
		Out of This World Today!</h2>

	<br>
	<form action="save-user">
		<h3>UserName</h3>
		<center>
			<input type="text" pattern = "[A-Za-z]{1,12}" name="username" maxLength="20"
				style="width: 250px;" />

		</center>
		<br>

		<h3>Email</h3>
		<center>
			<input type="text" name="email" pattern = "[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" maxLength="50" style="width: 250px;" />
		</center>

		<br>

		<h3>Password</h3>
		<center>
			<input type="password" pattern="[A-Za-z]{0,12}" name="password" maxLength="50"
				style="width: 250px;" />
		</center>

		<br>

		<h3>Credit Card Number</h3>
		<center>
			<input type="number" name="creditcard" maxLength="18"
				style="width: 250px" />
		</center>

		<br>

		<h3>Expiration Date</h3>
		<center>
			<input type="text" pattern="\d{2}/\d{2}" name="expiration" maxLength="10"
				style="width: 250px" />

		</center>
		<br>

		<h3>CVV</h3>
		<center>
			<input type="number" name="cvv" maxlength="4" style="width: 250px" />
		</center>

		<br>

		<center>
			<input type="submit" class="btn btn-primary" style="width: 180px">
		</center>

	</form>
</body>
</html>