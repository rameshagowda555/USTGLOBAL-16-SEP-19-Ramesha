<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@page session = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>

<%
String id ="";
Cookie[] cookies = request.getCookies();

if(cookies!=null) {
	for(Cookie cookie : cookies) {
		if(cookie.getName().equals("alwaysRemember")) {
			id = cookie.getValue();
		}
	}
}
%>
<body>
	<center>
	<h1 style="color: red"><%=msg %></h1>
		<fieldset style='width: 50%; height: 250px'>
			<form action='./login' method='post'>
				<table align='center'>
					<th colspan='2' style='color: red'><h2>Login</h2></th>
					<tr>
						<td>Enter Id</td>
						<td><input name='id' value='<%=id %>' type='number'></td>
					</tr>
					<tr>
						<td>Enter Password</td>
						<td><input name='password' type='password'></td>
					</tr>
					<tr>
						<td><input name='rememberme' type='checkbox' value='checked'>RememberMe</td>
					</tr>
					<tr>
						<td align='left'><input type='submit' value='Reset'></td>
						<td align='right' colspan='2'><input type='submit'
							value='Login'></td>
					</tr>
					<tr>
						<td><a href='register.html' alt='Not Found'>RegisterHere</a></td>
					</tr>
				</table>
			</form>
		</fieldset>
	</center>
</body>
</html>