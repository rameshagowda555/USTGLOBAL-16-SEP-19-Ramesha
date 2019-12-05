package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	public MyFirstServlet() {//it should have only public default constructor
		System.out.println("Object created");//object created
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init() method");//init method
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		
		Object obj = req.getAttribute("obj");//get the request Attribute
		PrintWriter out1 = resp.getWriter();
		out1.println("<h1>");
		out1.println(obj);
		out1.println("</h1>");

		System.out.println("Services");//service method
		System.out.println("Extra line of code ");

		ServletContext context = getServletContext();//pass information between servlet.
									//its common for all the servlet  ex-<context-param> in web.xml
		String companyname = context.getInitParameter("company-name");

		ServletConfig config = getServletConfig();//it is for particular servlet.
													//ex-<init-param> in web.xml
		String batchname = config.getInitParameter("batch-name");

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");

		Date date = new Date();
		out.println("<h1 style='color: Red'> Date and Time: ");
		out.println(date.toString());
		out.println("</h1>");

		out.println("<h2>");
		out.println("Company name  is : "+companyname);
		out.println("</h2>");

		out.println("<h2>");
		out.println("Batch Name is :"+batchname);
		out.println("</h2>");


		String url = req.getRequestURI();
		String method = req.getMethod();
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);

		out.println("</body>");
		out.println("</html>");
	}//end of doGet()
	@Override
	public void destroy() {
		System.out.println("Destroy()");
	}

}//end of MyFirstServlet