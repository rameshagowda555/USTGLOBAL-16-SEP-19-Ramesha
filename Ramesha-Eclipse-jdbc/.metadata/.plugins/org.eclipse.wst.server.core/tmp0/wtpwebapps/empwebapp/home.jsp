<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<<jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align='center' style='color: green'>Welcome to Home Page <%=info.getName() %></h1>
	<a href='./search.html' align='center'>Search</a><br>
	<a href='./changepassword.jsp' align='center'>Change Password</a><br>
	<a href='./logout' align='center'>Logout</a>
</body>
</html>