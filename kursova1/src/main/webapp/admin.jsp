<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Адмін панель</title>
</head>
<body>
<h1>Додати новини</h1>
<form action="addNews" method="post">
    <label for="title">Заголовок:</label>
    <input type="text" id="title" name="title"><br>
    <label for="category">Категорія:</label>
    <input type="text" id="category" name="category"><br>
    <label for="content">Текст:</label><br>
    <textarea id="content" name="content" rows="10" cols="50"></textarea><br>
    <input type="submit" value="Додати новину">
    <a href="index.jsp">Повернутися назад</a>
</form>
</body>
</html>
