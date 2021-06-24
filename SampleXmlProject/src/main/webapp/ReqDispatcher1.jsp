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
I am RequestDispatcher1. I called RequestDispatcher2...

<% RequestDispatcher rd=request.getRequestDispatcher("ReqDispatcher2.jsp");
rd.include(request,response);%>
</body>
</html>