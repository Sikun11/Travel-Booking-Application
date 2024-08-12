package com.tour;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/tourplan")
public class PackageServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		doGet(req,res);
	}

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		
		Userbean ub=new Userbean();
		ub.setName(req.getParameter("name"));
		ub.setMid(req.getParameter("mid"));
		ub.setCnt(req.getParameter("cnt"));
		ub.setDt(req.getParameter("dt"));
		ub.setMobno(Long.parseLong(req.getParameter("mobno")));
		ub.setSt(req.getParameter("st"));
		ub.setPack(req.getParameter("pack"));
		ub.setDys(Integer.parseInt(req.getParameter("dys")));
	
		
		int k=new PackageDAO().planing(ub);
		
		if(k>0)
		{
			    req.setAttribute("msg", "Your plan is booked Now . <br>");
		        RequestDispatcher dispatcher = req.getRequestDispatcher("tour.jsp");
		        dispatcher.forward(req, res); 
			
		}
		
	}

}
