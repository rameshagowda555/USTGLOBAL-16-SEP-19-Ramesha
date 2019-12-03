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
<fieldset>

<h2>${msg}</h2>
<h1>Total amount ${amount }</h1>
<form action="./confirmorder" method="post">
<% OrderBean obean = (OrderBean) request.getAttribute("oBean");
%>

<input type="submit" value="Confirm order">
</form>
</center>
</fieldset>

</body>
</html>