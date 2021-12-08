package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class Myhttpservlet extends HttpServlet{
   
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse responce)throws ServletException,IOException{
     
         System.out.println("This is get method...........");
         responce.setContentType("text/html");
         PrintWriter out = responce.getWriter();
         out.println("<h1>This is get method</h1>");    
    }
    
}
