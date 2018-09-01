<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Register | Hospital Management</title>
	</head>
	<body>
		<center>
			<form action="registration" method="post">
				<h2>First name</h2>
				<input type="text" placeholder="firstnmae" name="firstname"><br>
				<h2>Last name</h2>
				<input type="text" placeholder="lastname" name="lastname"><br>
				<h2>Email</h2>
				<input type="text" placeholder="email" name="email"><br>
				<h2>Password</h2>
				<input type="password" placeholder="password" name="password"><br>
				<input type="submit" value="Register">
			</form>
			<form action="signin" method="get">
				<h2>Please login, if you already registered </h2>
				<input type="submit" value="Signin">
			</form>
		</center>
	</body>
</html>