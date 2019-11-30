<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./form" method="post">
	<table>
	<tr>
		<td>Id:</td>
		<td><input type="number" name="id" placeholder="Enter ID"></td>
	</tr>
	<tr>
		<td>Name:</td>
		<td><input type="text" name="name" placeholder="Enter Name" ></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="password" name="password" placeholder="Enter PassWord"></td>
	</tr>
	<tr>
		<td>Gender:</td>
		<td><input type="text" name="gender"></td>
	</tr>
	<tr>
		<td>DOJ</td>
		<td><input type ="date" name ="doj"></td>
	</tr>
	<tr>
		<td><input type="reset" value="Reset"></td>
		<td><input type="submit" value="Register"></td>
	</tr>
	</table>
	</form>
</body>
</html>