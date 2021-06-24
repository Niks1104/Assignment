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
/* context is for application so it is accessible everywhere */
String  compname = application.getInitParameter("company");
out.println(compname);

/* Not accessible because config (dname) is created for ConfigParam file. So it is not accessible here */
String dname = config.getInitParameter("dname");
out.println(dname);
%>
</body>
</html>