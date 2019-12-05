package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Cookie cookie = new Cookie("emp-name", "Ramesha");//for creating a cookie
		
		cookie.setMaxAge(1000);//before adding a addcookie we have to set age

		resp.addCookie(cookie);//for send a cookie
		
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>Cookie Created</h1>");
		
	}//end of doGet()
}//end of CReateCookieServlet