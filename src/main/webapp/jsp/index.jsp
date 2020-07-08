<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/5/30
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello World!</h1>
    <c:forEach items="${list}" var="account">
        ${account.id}<br>
        ${account.name}<br>
        ${account.money}<br>
        --------------------<br>
    </c:forEach>
</body>
</html>
