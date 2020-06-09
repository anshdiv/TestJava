package com.quovantis.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterUsers
 */

public class RegisterUsers extends HttpServlet {
	static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static final String DB_URL = "jdbc:sqlserver://localhost;databaseName=JAVA_LEARNING";
	// Database credentials
	static final String USER = "sa";
	static final String PASS = "anshul.123";
	private static final String SQL_INSERT = "INSERT INTO Customers (CustomerName, City) VALUES (?,?)";
	/**
	* 
	*/
	private static final long serialVersionUID = -7028038605119102758L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		Connection conn;
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}
		try {
		    conn = DriverManager.getConnection(DB_URL,USER,PASS);
		    String name = req.getParameter("name");
			String city = req.getParameter("city");
			System.out.println(name);
			System.out.println(city);
			PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, city);
			preparedStatement.execute();
		    res.getWriter().print("Added Successfully");
		  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
