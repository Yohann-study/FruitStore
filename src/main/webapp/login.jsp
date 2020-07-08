<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/5/30
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/account/login" method="post">
        <input type="text" name="id"><br>
        <input type="text" name="name"><br>
        <input type="text" name="money"><br>
        <input type="submit" value="登录">
    </form>
    <form action="/account/add" method="post">
        <input type="text" name="id"><br>
        <input type="text" name="name"><br>
        <input type="text" name="money"><br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
