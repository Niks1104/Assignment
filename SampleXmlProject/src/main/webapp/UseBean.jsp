<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="obj" class="com.javaxml.Calculator"/> 
<%
int m=obj.cube(5);
out.print("cube of 5 is "+m);
%> 

<br/>
<jsp:useBean id="ob" class="com.javaxml.Employee"></jsp:useBean>
<jsp:setProperty property="name" name="ob" value="Nikita"/>
<jsp:getProperty property="name" name="ob"/>
<br/>
<jsp:setProperty property="password" name="ob" value="hello_nuts"/>
<jsp:getProperty property="password" name="ob"/>
<br/>
<jsp:setProperty property="email" name="ob" value="niki@gmail.com"/>
<jsp:getProperty property="email" name="ob"/>

</body>
</html>