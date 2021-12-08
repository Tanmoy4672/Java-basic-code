package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

public class FirstServlets implements Servlet {

    //life cycle method
    ServletConfig conf;

    @Override
    public void init(ServletConfig conf) {
        this.conf = conf;
        System.out.println("Creating Object.....");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Servicing......");
        
        //set the content type of the response
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        out.println("<h1>This is Tanmoy shome</h1>");
        out.println("<h1>Student at Daffodil Imternationl University</h1>");
        out.println("<h1>Todays date and time is "+new Date().toString()+" </h1>");
    }

    @Override
    public void destroy() {
        System.out.println("Going to destroy.......Servlet object");
    }

    //non-lice cycle method
    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }

    @Override
    public String getServletInfo() {
        return "This servet is created by Tanmoy Shome.";
    }

}
