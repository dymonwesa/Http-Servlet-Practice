<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Регистрация</title>
</head>
<body>
<form action="/registration" method="post">
    <label for="name">Name:
        <input type="text" name="name" id="name">
    </label>
    <label for="birthday">Birthday:
        <input type="date" name="birthday" id="birthday">
    </label>
</form>
</body>
</html>