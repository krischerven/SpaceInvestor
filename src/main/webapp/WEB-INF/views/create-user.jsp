<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create An Account</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/journal/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-ciphE0NCAlD2/N6NUApXAN2dAs/vcSAOTzyE202jJx3oS8n4tAQezRgnlHqcJ59C"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/spacestyle.css">
</head>
<body>
	<h2>Create your Account to Start Investing in Properties That are
		Out of This World Today!</h2>
	<form action="add-user">
		<br>
		<form>
		<h3>UserName</h3>
		<center>
			<input type="text" name="username" maxLength="20"
				style="width: 250px;" />
		</center>
		</form>
		<br>
		<form>
		<h3>Email</h3>
		<center>
			<input type="text" name="email" maxLength="20" style="width: 250px;" />
		</center>
		</form>
		<br>
		<form>
		<h3>Password</h3>
		<center>
			<input type="password" name="password" maxLength="20"
				style="width: 250px;" />
		</center>
		</form>
		<br>
		<form>
		<h3>Confirm Password</h3>
		<center>
			<input type="password" name="confirm" maxLength="20"
				style="width: 250px:" />
		</center>
		</form>
		<br>
		<form>
		<h3>Credit Card Number</h3>
		<center>
			<input type="number" name="creditNumber" maxLength="18"
				style="width: 250px" />
		</center>
		</form>
		<br>
		<form>
		<h3>Expiration Date</h3>
		<center>
			<input type="number" name="expiration" maxLength="4"
				style="width: 250px" />
		</form>
		</center>
		<br>
		<form>
		<h3>CVV</h3>
		<center>
			<input type="number" name="cvv" maxlength="3"
				style="width: 250px" />
		</center>
		</form>
		<br>
		<form action="save-user">
		<center>
			<input type="submit" class="btn btn-primary" style="width: 180px" >
		</center>
		</form>
	</form>

</body>
</html>