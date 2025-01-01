package edu.GU.expensemanager;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class UserServlet extends HttpServlet {

    // doPost method to handle form submission
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Insert data into the database
        try {
            // Database connection (assuming you have set up a MySQL DB)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expensetracker", "root", "password");
            String query = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);
            int result = stmt.executeUpdate();

            if (result > 0) {
                // Redirect to profile page after successful registration
                response.sendRedirect("profile.jsp?email=" + email);
            } else {
                // Handle error in user creation
                request.setAttribute("error", "Registration failed. Please try again.");
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQL error
            request.setAttribute("error", "Database error: " + e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    // doGet method to display the user profile
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");

        try {
            // Database connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expensetracker", "root", "password");
            String query = "SELECT name, email FROM users WHERE email = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Setting user information as request attributes
                request.setAttribute("user", rs);
                request.getRequestDispatcher("/profile.jsp").forward(request, response);
            } else {
                // Handle user not found
                request.setAttribute("error", "User not found.");
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQL error
            request.setAttribute("error", "Database error: " + e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
}
