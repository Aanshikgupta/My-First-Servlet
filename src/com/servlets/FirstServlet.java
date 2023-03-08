package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{
	
	ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Creating...");
		this.config=config;
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		pw.write("<h1>Hello World!</h1>");
		pw.write("<h1>Today's Date and Time is"+ new Date().toString()+"</h1>");
		System.out.println("Servicing");
		
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Object going to be destroyed");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is created by Aanshik Gupta";
	}

	
	

}
