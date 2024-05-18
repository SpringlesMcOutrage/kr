<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Новини</title>
</head>
<body>
<h1>Новини</h1>
<h2>Пошук Новин</h2>
<form action="search" method="get">
    <label for="keywords">Ключові слова:</label>
    <input type="text" id="keywords" name="keywords">
    <label for="category">Категорія:</label>
    <input type="text" id="category" name="category">
    <input type="submit" value="Пошук">
</form>
<h2>Admin</h2>
<form action="login.jsp">
    <input type="submit" value="Увіти як адмін">
</form>
<form action="/news">
    <input type="submit" value="Всі Новини">
</form>
</body>
</html>
