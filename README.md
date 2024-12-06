# Expensify - Expense and Budget Management System

**Expensify** is an application designed to help users manage their expenses and budgets efficiently. It allows users to input their daily expenses, categorize them, and track their spending against predefined budgets. Built with **Java**, **MySQL**, **JDBC**,**HTML**,**CSS**,**JavaScript** this project aims to provide an intuitive system for personal finance management.

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
    git clone https://github.com/Vamika-Singh/Expensify-Expense-Tracker.git
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

##Installation
JDK (Java Development Kit) Setup:
The Java Development Kit (JDK) is a software development kit used to develop Java applications. It contains everything you need to compile, debug, and run Java applications, including the Java Runtime Environment (JRE) and the necessary development tools.

Steps to Install JDK:
Download JDK:

Visit the official Oracle website: JDK Downloads or use OpenJDK from AdoptOpenJDK.
Choose the appropriate version for your operating system (Windows, macOS, or Linux).
Install JDK:

Run the installer and follow the on-screen instructions.
On Windows, ensure that you check the option to Add Java to PATH during installation.
Verify JDK Installation:

Open the command prompt (Windows) or terminal (macOS/Linux).
Type the following command to check if JDK is installed correctly:
bash
Copy code
java -version
If the installation is successful, you should see the installed version of Java.
Set JAVA_HOME (Optional):

You may need to set the JAVA_HOME environment variable to the JDK installation directory. This is often necessary for IDEs and build tools like Maven or Gradle.
For Windows:
Right-click This PC -> Properties -> Advanced system settings -> Environment Variables.
Add a new system variable JAVA_HOME with the value as the directory path of your JDK installation (e.g., C:\Program Files\Java\jdk-11.0.x).
IDE (Integrated Development Environment) Setup:
An IDE (Integrated Development Environment) is a software that provides comprehensive facilities to computer programmers for software development. IDEs typically include features like code completion, debugging, and version control integration.

For this project, you can use IntelliJ IDEA or Eclipse as the IDE.

IntelliJ IDEA Setup:
Download IntelliJ IDEA:

Visit the official website: IntelliJ IDEA Downloads.
Choose the Community edition (free) and download it for your operating system.
Install IntelliJ IDEA:

Run the installer and follow the instructions for your platform.
Configure JDK in IntelliJ IDEA:

Open IntelliJ IDEA and go to File -> Project Structure -> Project.
In the Project SDK section, click Add SDK and select the path to your JDK installation directory.
Create a New Project:

Once JDK is set up, you can create a new project by selecting File -> New Project.
Choose Java as the project type, and follow the steps to set up your project.
Eclipse Setup:
Download Eclipse:

Visit the official Eclipse website: Eclipse Downloads.
Download the Eclipse IDE for Java Developers version.
Install Eclipse:

Run the downloaded installer and follow the installation instructions.
Configure JDK in Eclipse:

Open Eclipse and go to Window -> Preferences -> Java -> Installed JREs.
Click Add and select the path to your JDK installation directory.
Create a New Java Project:

Click on File -> New -> Java Project to create a new project.
Choose a project name, and the IDE will automatically set up the project structure for you.

**FRONTEND**

## Features:
- **Responsive Design**: The user interface is responsive, providing an optimal user experience on both desktop and mobile devices.
- **Login and Registration Forms**: Simple and intuitive forms for user login and registration.
- **Email Validation**: Validates the email format to ensure it is correct.
- **Password Strength Validation**: Checks the password strength (weak, medium, or strong).
- **Password Confirmation**: Ensures that the password and the confirm password fields match.
- **Real-time Error Messages**: Displays dynamic error messages as the user interacts with the form fields.
- **Bootstrap Components**: Utilizes Bootstrap components for a clean, professional design.
- **Custom Styling**: Additional styling with custom CSS to enhance the user interface.

## Project Structure:
expensify-Expense-Tracker/Frontend
│
├── Login.html              # Login form HTML template
├── Register.html           # Registration form HTML template
├── style.css               # Custom CSS file for styling the forms
├── form-validation.js      # JavaScript file for form validation and error handling
└── README.md               # Project description and setup instructions

##Technologies Used

HTML: For structuring the content of the login and registration forms.

CSS: Custom styling for a professional look and feel.

Bootstrap: A front-end framework for responsive and mobile-first design.

JavaScript: For handling form validation and dynamic error messages.

##HOW TO RUN THE PROJECT:
Follow these steps to run the project locally on your system:

1.Clone the repository:
git clone https://github.com/Vamika-Singh/Expensify-Expense-Tracker.git

2.Navigate to the project folder:
cd Expensify-Expense-Tracker

3.Open Login.html or Register.html in your browser.


## License

This project is licensed under the MIT License.
