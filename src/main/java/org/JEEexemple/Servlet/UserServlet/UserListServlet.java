package org.JEEexemple.Servlet.UserServlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.JEEexemple.DAO.DAOimpl.UserDAOImpl;
import org.JEEexemple.Models.User;

import java.io.IOException;
import java.util.List;

@WebServlet("/listUsers")
    public class UserListServlet extends HttpServlet {
        private final UserDAOImpl userDAO = new UserDAOImpl();

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<User> userList = userDAO.findAllUser(); // Make sure this method is implemented
            request.setAttribute("userList", userList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("userList.jsp"); // A JSP page to display users
            dispatcher.forward(request, response);
        }
    }
