package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		ServletContext context = getServletContext();//pass information between servlet.
									//its common for all the servlet  ex-<context-param> in web.xml
		String companyname = context.getInitParameter("company-name");

		ServletConfig config = getServletConfig();//it is for particular servlet.
													//ex-<init-param> in web.xml
		String batchname = config.getInitParameter("batch-name");

		String empName = req.getParameter("empname");//for FormForward/FormInclude
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		out.println("<h1>");
		out.println("Name  : "+empName);
		out.println("</h1>");

		out.println("<h1>");
		out.println("Email  : "+email);
		out.println("</h1>");

		out.println("<h1>");
		out.println("Password  :"+password);
		out.println("</h1>");

		out.println("<h2>");
		out.println("Company Name  :"+companyname);
		out.println("</h2>");

		out.println("<h2>");
		out.println("Batch Name  : "+batchname);
		out.println("</h2>");

		out.println("</body>");
		out.println("</html>");
	}//end of doPost()


}//end of FormServlet
