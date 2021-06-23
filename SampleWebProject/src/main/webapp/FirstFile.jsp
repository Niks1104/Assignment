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
<jsp:include page="FromAction.jsp"></jsp:include>
</body>
</html>

