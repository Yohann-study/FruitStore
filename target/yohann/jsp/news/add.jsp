<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/17
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/master/master.jsp"%>
<html>
<head>
    <title>添加公告</title>
</head>
<body style="background-color: #9acfea;">
<body style="background-color: #9acfea;">
<div class="right" style="text-align: center;">
    <div style="margin-top: 10%">
        <h3>添加公告</h3>
    </div>
    <form action="/news/exAdd" method="post" style="margin-top: 5%">
        名称：<input type="text" name="name" placeholder="请输入名称" ><br>
        名称：<input type="text" name="content" placeholder="请输入内容" ><br>
        <input type="submit" value="添加">
    </form>
</div>
</body>
</html>