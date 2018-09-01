<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DBS</title>
</head>
	<body>
		<h1>Sum of two numbers</h1>
		<form action="Addition" method="POST">
			<input type="text" id="a" value="0" name="a"/>
			<input type="text" id="b" value="0" name="b"/>
			<input type="submit" value="Submit"/>
		</form>
		<!-- 
		<%
			System.out.println("Everything date now");
			Date date = new Date();
		%>
		Hello! The time is now <%=date %>
		<%out.println("<h1>" + request.getParameter("firstName") + "</h1>"); %>
		
		<c:forEach var="i" begin="0" end="5">
			<c:if test="${i%2==0}">
				Item <c:out value="${i}"/>
				<br>
			</c:if>
		</c:forEach>
		 -->
	</body>
</html>