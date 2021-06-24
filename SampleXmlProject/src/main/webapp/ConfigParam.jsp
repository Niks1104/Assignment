<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
From Config Param...
<%
/* context is for application so it is accessible here too */
String  compname = application.getInitParameter("company");
out.println(compname);
		
/* Here it is accessible because config (dname) is created for ConfigParam file. So it is accessible here */
String dname = config.getInitParameter("dname");
out.println(dname);
%>

</body>
</html>