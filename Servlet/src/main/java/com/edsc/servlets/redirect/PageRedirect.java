package com.edsc.servlets.redirect;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PageRedirect extends HttpServlet{
    
  @SuppressWarnings("static-access")
public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");

      // New location to be redirected
      String site = new String("http://www.davidsantiago.com.mx");

      response.setStatus(response.SC_MOVED_TEMPORARILY);
      response.setHeader("Location", site);    
    }
} 