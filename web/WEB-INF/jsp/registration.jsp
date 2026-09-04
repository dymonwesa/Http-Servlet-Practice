<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Регистрация</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registration" method="post">
    <label for="name">Name:
        <input type="text" name="name" id="name" required>
    </label><br>
    <label for="birthday">Birthday:
        <input type="date" name="birthday" id="birthday">
    </label><br>
    <label for="emailId">Email:
        <input type="email" name="email" id="emailId" required>
    </label><br>
    <label for="passwordId">Password:
        <input type="password" name="password" id="passwordId" required minlength="8">
    </label><br>
    <button type="submit">Send</button>
</form>
</body>
</html>