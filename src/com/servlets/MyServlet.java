package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("This is get method");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.write("<h1>This is get method of my servlet</h1>");
	}
	

}
