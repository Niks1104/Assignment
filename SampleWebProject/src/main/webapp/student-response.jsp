<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- The Student is Confirmed: ${param.firstName} ${param.lastName} -->
	 
	<%String fname=request.getParameter("firstName");
	String lname=request.getParameter("lastName");
	out.println("Hello "+ fname+ " "+lname);
	session.setAttribute("name",fname);
	session.setAttribute("last",lname);
	%> 
	
<a href="student-output.jsp">Go to Output Page</a>
</body>
</html>