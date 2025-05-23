package com.webServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        
        try (PrintWriter out = response.getWriter()) {
            
            String numberStr = request.getParameter("number");
            
            if (numberStr == null || numberStr.isEmpty()) {
                out.println("<html><body>");
                out.println("<h2>Error: Please enter a number.</h2>");
                out.println("</body></html>");
                return;
            }
            
            int number = Integer.parseInt(numberStr);
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            out.println("<html><body>");
            out.println("<h2>Factorial Calculator Result</h2>");
            out.println("<p>Factorial of " + number + " is: " + factorial + "</p>");
            out.println("</body></html>");
        
        } catch (NumberFormatException e) {
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h2>Error: Invalid input. Please enter a valid integer.</h2>");
            response.getWriter().println("</body></html>");
        }
    }
}
