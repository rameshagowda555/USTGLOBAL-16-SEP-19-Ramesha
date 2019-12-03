<%@page import="com.ustglobal.springmvcassessment.dto.OrderBean"%>
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
				OrderBean obean = (OrderBean) request.getAttribute("oBean");
			%>
			<%
				if (obean != null) {
			%>
			<table border=1>
				<tr>
					<th>Order Id</th>
					<th>Product name</th>
					<th>Retailer name</th>
					<th>Product priece</th>
					<th>Retailer Id</th>

				</tr>
				<tr>
					
					<td><%=obean.getOid()%></td>
					<td><%=obean.getProductBean().getPname()%></td>
					<td><%=obean.getRetailerBean().getName()%></td>
					<td><%=obean.getProductBean().getPrice()%></td>
					<td><%=obean.getRetailerBean().getId()%></td>
				
			
					


				</tr>
			</table>
<%
				}else{
			%>
			<h2>Nodata</h2>
			<% } %>
</body>
</html>