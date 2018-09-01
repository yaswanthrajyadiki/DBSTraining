<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true"  %>
<%@ page import="java.util.*, java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Page</title>
</head>
	<body>
		<h1>Oops...</h1>
		<p>
			Sorry, an error occurred.
			Here is the exception stack trace:
			<% exception.printStackTrace(response.getWriter()); %>
		</p>
	</body>
	
</html>