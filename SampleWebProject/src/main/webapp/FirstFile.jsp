<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="IncludePage.jsp" %>
hello
<%! int count=0; %> <!-- Declaration tag-Runs only once when object creates -->
<% count++; %> <!-- Scriptlet tag-Runs every time -->
<%= count %> <!-- Expression tag- Prints output -->

<!-- include shows the data of both pages (FirstFile.jsp + FromAction.jsp -->
<jsp:include page="FromAction.jsp"></jsp:include>

<!-- forward only shows the data of FromAction.jsp -->
<!-- In both condition link will be of this page (FirstFile.jsp) -->
<jsp:forward page="FromAction.jsp"></jsp:forward> 
</body>
</html>

