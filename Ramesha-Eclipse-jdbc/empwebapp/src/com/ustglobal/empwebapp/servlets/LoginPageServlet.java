package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id ="";
		Cookie[] cookies = req.getCookies();

		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}

		out.println("<html>");
		out.println("<center>");
		out.println("<fieldset style= 'width:50%;height: 250px'>");
		out.println("<form action='./login' method='post'>");
		out.println("<table align='center'>");
		out.println("<th colspan ='2' style='color: red'><h2>Login</h2></th>");
		out.println("<tr>");
		out.println("<td>Enter Id </td>");
		out.println("<td><input name ='id' value = '"+id+"' type='number'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Enter Password </td>");
		out.println("<td><input name ='password' type='password'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input name = 'rememberme' type='checkbox' value='checked'>Remember Me </td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td align='left'><input  type='submit' value='Reset' ></td>");
		out.println("<td align='right' colspan ='2'><input type='submit' value='Login' ></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td ><a href='register.html' alt='Not Found'>Register Here</a></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</fieldset>");
		out.println("</center>");
		out.println("</html>");

	}//end of doGet()

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}//end of LoginPageServlet
