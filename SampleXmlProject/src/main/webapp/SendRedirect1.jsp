<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/>
I am SendRedirect1 and I will tell browser that I am not able to handle the request.
So, it should call SendRedirect2
<%
response.sendRedirect("SendRedirect2.jsp");
%>
</body>
</html>