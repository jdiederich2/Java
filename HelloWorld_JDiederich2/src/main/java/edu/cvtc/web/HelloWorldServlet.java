package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet({ "/Index", "/index", "/Hello" })				// Mapping curly braces only required for multiple, else ""
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());   // response.getWriter() gives access to print writer, append gives path, and returns.
		
		response.setContentType("text/html");
		final PrintWriter out = response.getWriter();
		
		try {
			out.println("<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<title>Hello World!</title>\n\t</head>\n\t<body>\n\t\t<h1>Hello World!</h1>\n\t\t<p>This is our first servlet</p>\n\t</body>\n</html>");
		} finally {
			out.close();
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
