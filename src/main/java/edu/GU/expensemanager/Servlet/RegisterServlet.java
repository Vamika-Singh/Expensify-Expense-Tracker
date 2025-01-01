package edu.GU.expensemanager.Servlet;

import edu.GU.expensemanager.DAO;
import edu.GU.expensemanager.model;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            request.setAttribute("error", "All fields are required.");
            request.getRequestDispatcher("WEB-INF/jsp/register.jsp").forward(request, response);
            return;
        }

        User user = new User(name, email, password);
        UserDAO userDAO = new UserDAO();
        boolean isSaved = userDAO.saveUser(user);

        if (isSaved) {
            response.sendRedirect("profile?email=" + email);
        } else {
            request.setAttribute("error", "Registration failed.");
            request.getRequestDispatcher("WEB-INF/jsp/register.jsp").forward(request, response);
        }
    }
}
