<%@page import="com.ustglobal.empspringmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	EmployeeBean bean = (EmployeeBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>
	<br>
	<a href="./updateprofile">Update Profile</a>
	<br>
	<a href="./delete">Delete Profile</a>
	<br>
	<a href="./logout" style="float: right;">Logout</a>
	<h1 style="color: green">
		Welcome to Home Page <%=bean.getName()%></h1>
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./search">
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" name="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
		EmployeeBean employeeBean = (EmployeeBean) request.getAttribute("bean");
	%>
	<%
		if (employeeBean != null) {
	%>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>DOJ</th>
		</tr>
		<tr>
			<td><%=employeeBean.getName()%></td>
			<td><%=employeeBean.getEmail()%></td>
			<td><%=employeeBean.getGender()%></td>
			<td><%=employeeBean.getDoj()%></td>
		</tr>
	</table>
	<%
		}
	%>
	<h3>${msg}</h3>
</body>
</html>