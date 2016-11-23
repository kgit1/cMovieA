package com.cMovieA.testDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Check
 */
@WebServlet("/Check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//setup connection variables
		String user = "mov";
		String password= "123456";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/moviea?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		//get connection
		try{
			PrintWriter out = response.getWriter();
			out.println("Connecting to database: " + jdbcUrl);
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			out.println();
			out.println("SUCCESS!!");
			conn.close();			
		}catch(Exception e){
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
