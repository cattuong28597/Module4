<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 11/19/2021
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <h1>Dictionary</h1>
  <form action="/translate" method="get">
    <label>English</label>
    <input type="text" name="english" id="english">
    <input type="submit" value="Translate">

  </form>
  </body>
</html>
