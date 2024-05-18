<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Увійти</title>
</head>
<body>
<h2>Форма входу</h2>
<form action="login" method="post">
    <label for="username">Логін:</label><br>
    <input type="text" id="username" name="username"><br>
    <label for="password">Пароль:</label><br>
    <input type="password" id="password" name="password"><br><br>
    <input type="submit" value="Увійти">
    <a href="index.jsp">Повернутися назад</a>
</form>
</body>
</html>
