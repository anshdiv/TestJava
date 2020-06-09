package com.quovantis.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InputValidationFilter implements Filter {

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

		long startTime = System.nanoTime();
		// Get the IP address of client machine.
		String ipAddress = request.getRemoteAddr();

		// Log the IP address and current timestamp.
		System.out.println("IP " + ipAddress + ", Time " + new Date().toString());

		// Pass request back down the filter chain
			
		if (request.getParameter("name") == null || request.getParameter("name").isEmpty()) {
			response.getWriter().print("Name value can't be empty");
		}
		else if (request.getParameter("city") == null || request.getParameter("city").isEmpty()) {
			response.getWriter().print("City value can't be empty");
		}else {
			chain.doFilter(request, response);
			long endTime = System.nanoTime();
			System.out.println("Time: " + (endTime - startTime) );
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
