package com.quovantis.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements Filter {

	@Override
	public void destroy() {
		/*
		 * Called before the Filter instance is removed from service by the web
		 * container
		 */

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// Get the IP address of client machine.
		String ipAddress = request.getRemoteAddr();

		// Log the IP address and current timestamp.
		System.out.println("IP " + ipAddress + ", Time " + new Date().toString());

		// Pass request back down the filter chain
			
		if (request.getParameter("num1") == null || request.getParameter("num1").isEmpty()) {
			response.getWriter().print("Number1 value can't be empty");
		}
		else if (request.getParameter("num2") == null || request.getParameter("num2").isEmpty()) {
			response.getWriter().print("Number2 value can't be empty");
		}else {
			chain.doFilter(request, response);
		}


	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// Get init parameter
		String testParam = config.getInitParameter("test-param");

		// Print the init parameter
		System.out.println("Test Param: " + testParam);

	}

}
