package com.tour;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class Admin extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
        String Username = request.getParameter("uname");
        String Password = request.getParameter("pwd");
//        String duration = request.getParameter("duration");
//        String director = request.getParameter("director");
         
        System.out.println("Username admin: " + Username);
        System.out.println("Password admin: " + Password);
        PrintWriter writer = response.getWriter();
         
        if(Username.equals("dev") && Password.equals("12345")){
            response.sendRedirect("edit.html");
        }
        else{
               String htmlResponse = "<html>";
               htmlResponse += "<h2>Invalid Credentials</h2>";        
               htmlResponse += "</html>";
               writer.println(htmlResponse);
        }
         
        // return response
        
         
    }
}
