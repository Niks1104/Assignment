<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import ="com.jspdb.ProductDatabase"%>
<%@page import ="com.jspdb.ProductDetail"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ProductDatabase pda=new ProductDatabase();
		List<ProductDetail> productList = pda.display();
	%>
	
<table border="1">
	<tr>
		<th>Product Id</th>
		<th>Category</th>
		<th>Product Name</th>
		<th> Price </th>
	</tr>
<tr>
<%
	for (ProductDetail product : productList) {
%>
	<td><%=product.getId()%></td>
	<td><%=product.getCategory()%></td>
	<td><%=product.getName()%></td>
	<td><%=product.getPrice()%></td>
</tr>
<%
}
%>
</table>
</body>
</html>