
package com.practice; 

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterServlet extends HttpServlet{
   
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse respnose) throws SecurityException,IOException, ServletException{
        respnose.setContentType("text/html");
        PrintWriter out=respnose.getWriter();
        String name=request.getParameter("user_name");
        String password=request.getParameter("user_password");
        String email=request.getParameter("user_email");
        String gender=request.getParameter("user_gender");
        String course=request.getParameter("user_course");
        String cond=request.getParameter("condition");
        if(cond!=null){
        if (cond.equals("checked")) {
            out.println("<h2>Welcome to Register Servlet</h2>");
            out.println("<h2>Name:"+name+"</h2>");
            out.println("<h2>Password:"+password+"</h2>");
            out.println("<h2>Email:"+email+"</h2>");
            out.println("<h2>Gender:"+gender+"</h2>");
            out.println("<h2>Course:"+course+"</h2>");
            //here we also use JDBC
            //save to DB
            
            RequestDispatcher rd=request.getRequestDispatcher("success");
            rd.forward(request, respnose);
        }
        }else{
            out.println("<h2>You have not accepted terms and conditions yet.</h2>");
            //I want to include output of index.html
            //get the object of RequestDispatcher
            RequestDispatcher rd= request.getRequestDispatcher("index.html");
            //include
            rd.include(request, respnose);
        }
    }
}
