<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Tennis Player DB</title>
</head>
<body>

<h2>Welcome to the tennis players database!</h2>

<form action="/spring/playerdb" method="POST">
    <b>Enter a player: <input type="text" name="name"/></b>
    <input type="submit" value="Enter"/>
</form>

</body>
</html>