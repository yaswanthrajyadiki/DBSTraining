<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using classes in jsp</title>
</head>
	<body>
		<center>
			<h1>Using JavaBeans in JSP</h1>
			<jsp:useBean id = "test" class = "abc.HelloClass"/>
			<jsp:setProperty property="message" name="test" value="Hello! I am using class"/>
			<p> Got Message..! </p>
			<jsp:getProperty property="message" name="test"/>
			<jsp:forward page="Hello.jsp">
				<jsp:param value="Yaswanth" name="firstName"/>
			</jsp:forward>
		</center>
	</body>
</html>