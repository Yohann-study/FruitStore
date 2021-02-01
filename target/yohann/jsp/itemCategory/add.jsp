<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/14
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/master/master.jsp"%>
<html>
<head>
    <title>添加分类</title>
</head>
<body style="background-color: #9acfea;">
    <div class="right" style="text-align: center;">
        <div style="margin-top: 10%">
            <h3>添加一级分类</h3>
        </div>
        <form action="/itemCategory/exAdd" method="post" style="margin-top: 5%">
            名称：<input type="text" name="name" placeholder="请输入名称" >&nbsp;
            <input type="submit" value="添加">
        </form>
    </div>
</body>
</html>
