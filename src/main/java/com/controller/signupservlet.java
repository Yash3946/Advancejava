package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signupservlet")
public class signupservlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String Email = request.getParameter("Email");
		String Password = request.getParameter("Password");
		
		System.out.println("FirstName => "+FirstName);
		System.out.println("LastName => "+LastName);
		System.out.println("Email => "+Email);
		System.out.println("Password => "+Password);
		
		request.setAttribute("FirstName", FirstName);
		request.setAttribute("LastName" , LastName);
		request.setAttribute("Email" , Email);
		request.setAttribute("Password" , Password);
		
		RequestDispatcher rd = request.getRequestDispatcher("ViewUser.jsp");
		rd.forward(request, response);
	}
}
