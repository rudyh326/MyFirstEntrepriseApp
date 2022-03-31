package com.example.myfirstentrepriseapp;

import java.io.*;
import javax.ejb.EJB;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public HelloServlet() {
    }
    @EJB
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        Hello message = new HelloBean();
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message.sayHello() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
