<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%-- <%@page extends="javax.servlet.http.HttpServlet" %> --%>
<%!
	public void jspInit(){
		System.out.println("This is Init Phase");
	}
%>
<%!
	public void jspDestroy()
{
		System.out.println("This is Destroy Phase");
	}

/* protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException){
	PrintWriter out = resp.getWriter();
	out.print("<html>");
	out.print("<h1>This extends HttpServlet</h1>");
	out.print("</html>");
} */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
  m1();
 %>
<%!
	private void m1(){
	System.out.println("This is m1()");
}
%>
<% 
 	Date date = new Date();
	m();
%>
<!-- Declaration Tags -->
<%!
 	public int i = 10;
	public void m(){
		System.out.println(i);
	}
%>
<body>
 <h1 style="color:green" align="center">Date and Time is <%=date %></h1>
 <h3 style="color: blue"><%=i %></h3>
</body>
</html>

<%!
	protected void m2(){
		System.out.println("This is m2()");
	}
 %>
 <%
  m2();
 %>