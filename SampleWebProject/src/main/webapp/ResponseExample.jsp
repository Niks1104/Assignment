<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Response Example
<% String name=request.getParameter("userName");
String last=request.getParameter("lastName");
System.out.println("Name="+name +" Last Name="+last);
//out.println("Name="+name +" Last Name="+last);
%>
<%= "Name="+name +" Last Name="+last  %>
</body>
</html>