<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<!-- Going to include hello.jsp -->
		<!--  <%@ include file="Hello.jsp" %> -->
		<%
			String a = request.getParameter("a") == null ? "0" : request.getParameter("a");
			String b = request.getParameter("b") == null ? "0" : request.getParameter("b");
			out.println("<h1> Sum of " + a + " and " + b + " = " + (Integer.parseInt(a) + Integer.parseInt(b)) + "</h1>");
			int x = 1;
			if(x==1)
				throw new RuntimeException("Exception x should not be 1");
		%>
	</body>
</html>