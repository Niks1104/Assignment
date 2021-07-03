<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import ="com.jspdb.ProductDatabase"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="com.jspdb.ProductDetail"></jsp:useBean>
	<jsp:setProperty property="id" name="obj"/> 
	<jsp:setProperty property="name" name="obj"/> 
	
	<%  
	int status=ProductDatabase.delete(obj);
	if(status>0)  
	out.print("Product is deleted");    
    %> 
</body>
</html>