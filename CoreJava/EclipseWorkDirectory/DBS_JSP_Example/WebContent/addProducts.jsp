<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddProduct</title>
</head>
	<body>
		<form action="CartServlet" method="post">
			ID:<br>
			<input type="text" id="id" name="id" placeholder="ID"> <br>
			Product Name:<br>
			<input type="text" id="prodName" name="prodName" placeholder="ProductName"> <br>
			Price:<br>
			<input type="text" id="price" name="price" placeholder="Price"> <br>
			Quantity:<br>
			<input type="text" id="quantity" name="quantity" placeholder="Quantity"> <br>
			<input type="submit" value="Add to cart"/>
		</form>
		<form action="CartServlet" method="get">
			<input type="submit" value="Total"/>
		</form>
		<h1><%out.println(request.getParameter("products") == null ? "Cart was emplty" : request.getParameter("products"));%></h1>
	</body>
</html>