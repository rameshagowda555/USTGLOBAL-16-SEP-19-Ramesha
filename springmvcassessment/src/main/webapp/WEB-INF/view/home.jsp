<%@page import="com.ustglobal.springmvcassessment.dto.OrderBean"%>
<%@page import="com.ustglobal.springmvcassessment.dto.ProductBean"%>
<%@page import="com.ustglobal.springmvcassessment.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
		<a href="./logout" style="float: right">logout</a>
		<a href="./changepassword">change password</a><br> 
		<a href="./vieworder">view </a>
			<h3>${msg}</h3>

			<h2 style="color: green">Welcome to Home Page :<%=bean.getName()%></h2>
			<h2>Search Products</h2>
			<form action="./search">
				<table>
					<tr>
						<td><input type="number" name="id"></td>
						<td><input type="submit" value="search"></td>

					</tr>
				</table>
			</form>
		<%
 		ProductBean productBean = (ProductBean) request.getAttribute("bean");
 		 %>
  	<%
 	if (productBean != null) {
 	%>
			<table border="1">
				<tr>
					<th>ProductId</th>
					<th>ProductName</th>
					<th>ProductPrice</th>
					

				</tr>
				<tr>
					<td><%=productBean.getPid()%></td>
					<td><%=productBean.getPname()%></td>
					<td><%=productBean.getPrice()%></td>
				</tr>
			</table>
 <%
 	ProductBean pbean = (ProductBean) session.getAttribute("pbean");
 %>
			<h1>Enter Quantity</h1>
			<form action="./placeorder" method="post">
				<input type="number" name="quantity"> <input type="submit"
					value="order"> <input type="hidden"
					value="<%=productBean.getPrice()%>" name="price">


			</form> 
<%
 	}
 %>

			</center>
	</fieldset>

</body>
</html>