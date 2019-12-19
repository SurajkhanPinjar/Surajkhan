package com.capgemini.myweb.servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/forward") 
public class ForwardServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String url = "./getEmployee";
//		String url = "http://www.youtube.com";			//We Cannot forward  Response to the External resource 
	
	RequestDispatcher dispatcher = req.getRequestDispatcher(url);
	dispatcher.forward(req, resp);
	
	} // End Of doGet()

} //End Of Class
