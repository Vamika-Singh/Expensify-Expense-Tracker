package edu.GU.expensemanager.DAO;

import edu.GU.expensemanager.model.Expense;
import edu.GU.expensemanager.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDao {

    // Insert an expense
    public void insertExpense(Expense expense) {
        String insertQuery = "INSERT INTO expenses (user_id, amount, description, date, category) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setInt(1, expense.getUserId());
            preparedStatement.setDouble(2, expense.getAmount());
            preparedStatement.setString(3, expense.getDescription());
            preparedStatement.setString(4, expense.getDate());
            preparedStatement.setString(5, expense.getCategory());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Get an expense by ID
    public Expense getExpenseById(int expenseId) {
        Expense expense = null;
        String selectQuery = "SELECT * FROM expenses WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {

            preparedStatement.setInt(1, expenseId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                expense = new Expense();
                expense.setId(resultSet.getInt("id"));
                expense.setUserId(resultSet.getInt("user_id"));
                expense.setAmount(resultSet.getDouble("amount"));
                expense.setDescription(resultSet.getString("description"));
                expense.setDate(resultSet.getString("date"));
                expense.setCategory(resultSet.getString("category"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expense;
    }

    // Get all expenses
    public List<Expense> getAllExpenses() {
        List<Expense> expenseList = new ArrayList<>();
        String selectQuery = "SELECT * FROM expenses";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectQuery)) {

            while (resultSet.next()) {
                Expense expense = new Expense();
                expense.setId(resultSet.getInt("id"));
                expense.setUserId(resultSet.getInt("user_id"));
                expense.setAmount(resultSet.getDouble("amount"));
                expense.setDescription(resultSet.getString("description"));
                expense.setDate(resultSet.getString("date"));
                expense.setCategory(resultSet.getString("category"));
                expenseList.add(expense);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenseList;
    }

    // Update an expense
    public void updateExpense(Expense expense) {
        String updateQuery = "UPDATE expenses SET user_id = ?, amount = ?, description = ?, date = ?, category = ? WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

            preparedStatement.setInt(1, expense.getUserId());
            preparedStatement.setDouble(2, expense.getAmount());
            preparedStatement.setString(3, expense.getDescription());
            preparedStatement.setString(4, expense.getDate());
            preparedStatement.setString(5, expense.getCategory());
            preparedStatement.setInt(6, expense.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete an expense by ID
    public void deleteExpense(int expenseId) {
        String deleteQuery = "DELETE FROM expenses WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {

            preparedStatement.setInt(1, expenseId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
