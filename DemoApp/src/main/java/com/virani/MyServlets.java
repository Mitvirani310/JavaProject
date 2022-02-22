package com.virani;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//ServletContext and ServletConfig

@WebServlet("/hom")
public class MyServlets extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		
		PrintWriter out = response.getWriter();
		out.println("Hi ");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str);
	}

}
