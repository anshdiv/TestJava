package com.quovantis.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7028038605119102758L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		 System.out.println(res.getLocale());
		 RequestDispatcher dispatcher = req.getRequestDispatcher("welcome");
		 dispatcher.forward(req, res);
	 }
}
