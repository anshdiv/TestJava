package com.quovantis.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelCome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		 String name = req.getParameter("name");
		 res.getWriter().print("Welcome!! "+name);
	 }

}
