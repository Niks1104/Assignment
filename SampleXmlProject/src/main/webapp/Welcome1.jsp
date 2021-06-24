<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String name=request.getParameter("uname");
out.println("Welcome "+name);

pageContext.setAttribute("user",name,pageContext.SESSION_SCOPE);
%>
<br/>
<% 
String name1=request.getParameter("uname");
out.println("Welcome "+name1);

pageContext.setAttribute("user",name1,pageContext.PAGE_SCOPE);
%>
<br/>

<a href="Welcome2.jsp">Go To Welcome 2 page</a>
</body>
</html>