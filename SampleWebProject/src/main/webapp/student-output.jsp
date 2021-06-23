<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String first=(String)session.getAttribute("name");
String last_name=(String)session.getAttribute("last");%>

<%= first+" "+last_name+", Welcome to JSP World" %>
</body>
</html>