Expensify is an application designed to help users manage their expenses and budgets efficiently. It allows users to input their daily expenses, categorize them, and track their spending against predefined budgets. Built with Java, MySQL, and JDBC, this project aims to provide an intuitive system for personal finance management.

Features
User Registration and Login: Secure login and registration for users.
Add and Categorize Expenses: Track daily expenses and categorize them for better analysis.
Set and Track Budgets: Define budgets for different categories and monitor spending.
Generate Expense Reports: Generate reports to understand spending patterns.
View All Expenses: View all expenses categorized by date and type.
Setup
Prerequisites
Before you begin, ensure you have the following installed:

JDK 17 or higher
MySQL Database (for storing expenses and user data)
Maven (for dependency management)
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/expensify.git
Set up the MySQL Database:

Install MySQL and create a new database called expensify.
Run the create_tables.sql script (found in the database folder) to create the necessary tables.
Configure Database Connection:

Open the DBConnection.java file located in the util package.
Update the database connection settings (username, password, and database URL) to match your local MySQL setup.
Run the Project:

Open the project in your preferred IDE (IntelliJ IDEA or Eclipse).
Build the project using Maven:
bash
Copy code
mvn clean install
Run the project. The application will start, and you can access the expense and budget management features.
Technologies Used
Java (JDK 17) - Core programming language
MySQL - Database for storing user, expenses, and budget data
JDBC - Database connectivity for executing queries
Maven - For managing dependencies and project build lifecycle
Database Schema
The following tables are used in the database:

users - Stores user account information such as username and password.
categories - Stores categories for expenses (e.g., Food, Transportation, Entertainment).
expenses - Stores individual expense records with their details (amount, date, category).
budgets - Stores user-set budgets for each category, allowing users to track their spending against set limits.

Explanation of JDK and IDE Setup
To run the Expensify project, you need to ensure that your development environment is correctly set up:

JDK (Java Development Kit) Setup:
Download JDK:

Visit the official Oracle JDK Downloads page.
Download and install JDK 17 or a later version.
Set Up JDK:

On Windows, make sure to set the JAVA_HOME environment variable to the JDK installation directory (e.g., C:\Program Files\Java\jdk-17).
On macOS/Linux, you can set the path to JDK in your terminal profile (.bash_profile, .zshrc, etc.).
Verify JDK Installation:

Open the terminal/command prompt and type:
bash
Copy code
java -version
If the installation was successful, you should see the version of Java installed.
IDE (Integrated Development Environment) Setup:
IntelliJ IDEA Setup:

Download IntelliJ IDEA:

Visit the IntelliJ IDEA Download Page.
Download the Community Edition (free).
Install IntelliJ IDEA:

Follow the installation instructions for your platform.
Configure JDK in IntelliJ IDEA:

After installing IntelliJ IDEA, open the application.
Go to File → Project Structure → Project and set the Project SDK to JDK 17 (or the version you've installed).
Eclipse Setup:

Download Eclipse:

Visit the official Eclipse Downloads page.
Download Eclipse IDE for Java Developers.
Install Eclipse:

Follow the installation instructions.
Configure JDK in Eclipse:

Open Eclipse and go to Window → Preferences → Java → Installed JREs.
Add JDK 17 to the list of installed JREs and set it as the default.

License
This project is licensed under the MIT License.
