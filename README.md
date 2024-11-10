# Expensify - Expense and Budget Management System

**Expensify** is an application designed to help users manage their expenses and budgets efficiently. It allows users to input their daily expenses, categorize them, and track their spending against predefined budgets. Built with **Java**, **MySQL**, and **JDBC**, this project aims to provide an intuitive system for personal finance management.

## Features

- User Registration and Login
- Add and categorize expenses
- Set and track budgets for different categories
- Generate expense reports
- View all expenses by date and category

## Setup

### Prerequisites

Before you begin, ensure you have the following installed:

1. **JDK 17** or higher
2. **MySQL Database**
3. **Maven**

### Installation

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/your-username/expensify.git
    ```

2. Set up the database:
    - Install MySQL and create a new database called `expensify`.
    - Run the `create_tables.sql` script to create necessary tables.

3. Configure the database connection:
    - Edit the `DBConnection.java` file in the `util` package to set your database credentials (username, password, URL).

4. Run the project:
    - Open the project in your preferred IDE (IntelliJ IDEA or Eclipse).
    - Build and run the project.

## Technologies Used

- **Java** (JDK 17)
- **MySQL** (for database)
- **JDBC** (for database connectivity)
- **Maven** (for dependency management)

## Database Schema

The project uses the following tables:

1. `users` - stores user information.
2. `categories` - stores categories for expenses.
3. `expenses` - stores expense records.
4. `budgets` - stores user budgets for categories.

## License

This project is licensed under the MIT License.
