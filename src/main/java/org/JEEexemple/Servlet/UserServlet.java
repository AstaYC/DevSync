package org.JEEexemple.Servlet;

import java.util.List; // Use the correct List import
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.JEEexemple.DAO.DAOimpl.UserDAOImpl;
import org.JEEexemple.Models.User;

import java.io.IOException;

public class UserServlet {
@WebServlet("/addUser")
public class UserRegisterServlet extends HttpServlet {
    private final UserDAOImpl userDAO = new UserDAOImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);

        userDAO.createUser(user);
        response.sendRedirect("success.jsp"); // Redirect to a success page
    }
}

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
}


