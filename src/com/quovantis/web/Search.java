package com.quovantis.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Search extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7028038605119102758L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		 System.out.println(res.getLocale());
		 String query=req.getParameter("query");  
	     res.sendRedirect("https://www.google.co.in/#q="+query);  
	 }
}
