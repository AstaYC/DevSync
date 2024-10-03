package org.JEEexemple.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ohayo")
public class TestAllah extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type to text/html to ensure proper rendering
        response.setContentType("text/html;charset=UTF-8");

        // Write response content
        response.getWriter().write("GHAAAAAAAAAAAAAAAAAAAAAAAAAA9!");
    }
}
