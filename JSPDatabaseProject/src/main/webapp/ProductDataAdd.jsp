<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import ="com.jspdb.ProductDatabase"%>
<html>
<body>

	<jsp:useBean id="obj" class="com.jspdb.ProductDetail"></jsp:useBean>
	<jsp:setProperty property="id" name="obj"/> 
	<jsp:setProperty property="category" name="obj"/>
	<jsp:setProperty property="name" name="obj"/> 
	<jsp:setProperty property="price" name="obj"/>
	
	<%  
	int status=ProductDatabase.register(obj);
	if(status>0)  
	out.print("You are successfully registered");    
    %> 
	
</body>
</html>