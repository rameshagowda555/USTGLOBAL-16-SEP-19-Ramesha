<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<body>
<center>
<fieldset style="width: 50% ;height: 250px">
<h1 style="color: red"><%=msg %></h1>
<form action="./changepassword" method="post">
	<table align="center">
		<th colspan ="2" ><h2 style="color: red">Change Password</h2></th>
		<tr>
			<td align="left"><a href ="./home" >Home</a></td>
			<td align="right"><a href ="./logout">Logout</a></td>
		</tr>
	
		<tr>
			<td>NewPassword</td>
			<td><input name="password" type="password"></td>
		</tr>
		<tr>
			<td>ChangePassword</td>
			<td><input name="confirmpassword" type="password"></td>
		</tr>
		<tr>
			<td align="left"><input  type="submit" value="Reset" ></td>
			<td align="right"><input type="submit" value="Change"></td>
		</tr>
	</table>
</form>
</center>
</fieldset>
</body>
</html>