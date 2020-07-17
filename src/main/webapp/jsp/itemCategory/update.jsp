<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/14
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/master/master.jsp"%>
<html>
<head>
    <title>更新一级分类</title>
</head>
<body style="background-color: #9acfea;">
    <div class="right" style="text-align: center;">
        <div style="margin-top: 10%">
            <h3>修改一级分类</h3>
        </div>
        <form action="/itemCategory/exUpdate?id=${obj.id}" method="post" style="margin-top: 5%">
            名称：<input type="text" name="name" value="${obj.name}">&nbsp;
            <input type="submit" value="修改">
        </form>
    </div>
</body>
</html>
