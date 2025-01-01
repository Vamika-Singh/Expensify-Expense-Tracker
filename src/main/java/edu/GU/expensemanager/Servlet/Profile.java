package edu.GU.expensemanager.Servlet;

import edu.GU.expensemanager.DAO;
import edu.GU.expensemanager.model;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/profile")
 class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        UserDAO userDAO = new UserDAO();
        User user = userDAO.getUserByEmail(email);

        if (user != null) {
            request.setAttribute("user", user);
            request.getRequestDispatcher("WEB-INF/jsp/profile.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "User not found.");
            request.getRequestDispatcher("WEB-INF/jsp/error.jsp").forward(request, response);
        }
    }
}