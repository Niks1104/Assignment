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
/* Session_Scope is valid for 20 mins after ending of session and It can be accessible to all pages */
String name=(String)pageContext.getAttribute("user",pageContext.SESSION_SCOPE);
out.println("Hello "+name);
%>
<br/>
<%= "Session_Scope is valid for 20 mins after ending of session and It can be accessible to all pages"%>
<br/>
<% 	
/* Page_Scope is only for one page. So I can't access data from Welcome1.jsp page */
String name1=(String)pageContext.getAttribute("user",pageContext.PAGE_SCOPE);
out.println("Hello "+name1);
%>
<br/>
<%="Page_Scope is only for one page. So I can't access data from Welcome1.jsp page" %>

</body>
</html>