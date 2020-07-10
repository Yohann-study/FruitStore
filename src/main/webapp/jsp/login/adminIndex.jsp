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
    <style>
        .row button{
            background-color:transparent;
            border-style:none;
            font-size: 18px;
            margin-top: 10px;
            margin-bottom: 10px;
        }
        .row button:hover{
            background-color:rgb(91,192,222) ;
            color: red;
        }
    </style>
</head>
<body style="background-color: rgb(126,222,222);">
    <div class="container-fluid"  style="background-color: rgb(91,192,222);padding-top: 10px;padding-bottom: 10px;">
        <button type="button" class="btn btn-info" style="pointer-events: none;border: none;font-size: 20px;margin-left: 20px;margin-right: 20px;"><span class="glyphicon glyphicon-apple"></span>水果商城后台管理</button>
        <button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> 前台首页</button>
        <button type="button" class="btn btn-success"><span class="glyphicon glyphicon-trash"></span> 清除缓存</button>
        <button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-off"></span> 退出登录</button>
    </div>

    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-3 col-sm-2 col-md-1" style="text-align: center;">
                <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-triangle-right"></span>类目管理</button>
                <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-triangle-right"></span>用户管理</button>
                <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-triangle-right"></span>商品管理</button>
                <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-triangle-right"></span>订单管理</button>
                <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-triangle-right"></span>公告管理</button>
                <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-triangle-right"></span>留言管理</button>
            </div>
            <div class="col-xs-9 col-sm-10 col-md-11" style="background-color: rgba(116,96,79,0.27)">
            </div>
        </div>
    </div>
</body>
</html>
