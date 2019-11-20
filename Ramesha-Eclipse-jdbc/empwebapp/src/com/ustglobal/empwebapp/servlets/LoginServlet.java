package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDAOManager;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");

		String rememberMe = req.getParameter("rememberme");//for checkbox
		if(rememberMe==null) {
			Cookie[] cookies = req.getCookies();

			if(cookies!=null) {
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals("alwaysRemember")) {
						cookie.setMaxAge(0);
						resp.addCookie(cookie);
					}
				}
			}
		}else {
			Cookie cookie = new Cookie("alwaysRemember", id+"");
			resp.addCookie(cookie);

		}

		EmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();
		EmployeeInfo info = dao.auth(id, password);


		if(info==null) {
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<h2 style='color:red' align='center'>Invalid Id or Password</h2>");
			out.println("</html>");

			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.include(req, resp);
		}else {
			HttpSession session = req.getSession(true);//create session object
			session.setAttribute("info", info);//store info into session object and until user log's out this session object is present

			RequestDispatcher dispather = req.getRequestDispatcher("/home");//forward to home page
			dispather.forward(req, resp);
		}

	}//end of doPost()
}//end of LoginServlet
