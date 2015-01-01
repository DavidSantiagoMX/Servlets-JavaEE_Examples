package com.edsc.servlets.response;

// Import required java libraries
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
@SuppressWarnings("serial")
public class showError extends HttpServlet {
 
  // Method to handle GET method request.
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set error code and reason.
      response.sendError(406, "Reported error: 406!" );
  }
  // Method to handle POST method request.
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
     doGet(request, response);
  }
}
