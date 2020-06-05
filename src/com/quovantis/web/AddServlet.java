package com.quovantis.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		 
		 int num1 = Integer.parseInt(req.getParameter("num1"));
		 int num2 = Integer.parseInt(req.getParameter("num2"));
	     int k = num1+num2;
		 PrintWriter out = res.getWriter();
		 out.print("Result is "+k);
	 }
}
