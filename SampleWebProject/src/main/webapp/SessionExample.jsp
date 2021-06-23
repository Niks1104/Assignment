<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%session.setAttribute("name","Nikita");
//session.invalidate();
out.println(session.getId());
out.println(session.isNew());
out.println(session.getAttributeNames());
System.out.println(session.getCreationTime());
String name = (String)session.getAttribute("name"); 

%>
<%= "user name ="+name %>
</body>
</html>