<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/9
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/master.jsp"%>
<html>
<head>
    <title>管理员首页</title>
    <link rel="stylesheet" href="${root}/resource/css/adminIndex.css">
    <script src="${root}/resource/js/adminIndex.js"></script>
</head>
<body>
    <div class="container-fluid">
        <div class="alert alert-primary" role="alert">
            <h5>后台管理</h5>
        </div>
        <div class="btn-group" role="group" aria-label="Basic example">
            <h5>后台管理</h5>
            <button type="button" class="btn btn-secondary">前台登录</button>
            <button type="button" class="btn btn-secondary">清除缓存</button>
            <button type="button" class="btn btn-secondary">退出登录</button>
        </div>
        <div class="row">
            <div class="col-sm-12 col-md-4" style="background-color: #1c7430">
                1
            </div>
            <div class="col-sm-12 col-md-8" style="background-color: rgba(116,96,79,0.27)">
                2
            </div>
        </div>
    </div>
</body>
</html>
