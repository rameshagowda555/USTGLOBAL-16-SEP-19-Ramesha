<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<fieldset>
	
	<h3>${msg}</h3>
		<center>
			<form action="./login" method="post">
				<h1>login page</h1>
				<table>
					<tr>
						<td>ID</td>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="login"></td>
					</tr>
				</table>
			</form>
			<a href="./register">Click here to Register</a>
		</center>
	</fieldset>
</body>
</html>