<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Profile</title>
</head>
<body>
    <h2>User Profile</h2>

    <!-- Check if the user exists and display their profile -->
    <c:if test="${not empty user}">
        <h3>Welcome, ${user.name}!</h3>
        <p>Email: ${user.email}</p>
    </c:if>

    <c:if test="${empty user}">
        <p>User not found or there was an error fetching the details.</p>
    </c:if>

    <a href="register.jsp">Go back to Registration</a>
</body>
</html>
