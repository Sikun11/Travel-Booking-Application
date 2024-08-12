package com.tour;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		
		Userbean ub=new Userbean();
		ub.setUname(req.getParameter("uname"));
		ub.setPwd(req.getParameter("pwd"));
		ub.setName(req.getParameter("name"));
		ub.setMid(req.getParameter("mid"));
		ub.setMobno(Long.parseLong(req.getParameter("mobno")));
		
		int k=new RegisterDAO().insert(ub);
		
		if(k>0)
		{
			    req.setAttribute("msg", "Registration successful! You can now log in.<br>");
		        RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
		        dispatcher.forward(req, res); 
			
		}
		
	}

}
