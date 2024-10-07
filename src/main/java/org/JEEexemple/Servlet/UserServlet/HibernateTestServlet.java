package org.JEEexemple.Servlet.UserServlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.JEEexemple.Util.HibernateUtil;

@WebServlet("/hibernateTest")
public class HibernateTestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            response.getWriter().println("Hibernate session opened successfully!");
            } catch (Exception e) {
                e.printStackTrace(response.getWriter());
            }
    }
}