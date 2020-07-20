<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/9
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 导入bootstrap框架 -->
<link rel="stylesheet" href="${root}/resource/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" href="${root}/resource/font-awesome/css/font-awesome.min.css">
<script src="${root}/resource/bootstrap-3.3.7-dist/jQuery/jquery-1.11.0.js"></script>
<script src="${root}/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<html>
<head>
    <title>管理员首页</title>
</head>
<body>
    <style>
        body{
            background-color: rgb(126,222,222);
        }
        .left li{
            background-color:transparent;
            border-style:none;
            font-size: 15px;
            margin-top: 10px;
            margin-bottom: 10px;
        }
        .left a{
            padding: 10px 10px 10px 10px;
            border-radius:30px;
        }
        .left a:hover{
            text-decoration:none;
            background-color:rgb(91,192,222) ;
        }
        .main{
            width: 80%;
            height: 90%;
            float: left;
            background-color: #9acfea;
        }
        .left{
            text-align: center;
            width: 20%;
            height: 90%;
            float: left;
        }
        .container-fluid{
            background-color: rgb(91,192,222);
            padding:20px;
            height: 10%;
        }
    </style>
    <div class="container-fluid">
        <a style="pointer-events: none;border: none;font-size: 20px;margin-left: 20px;margin-right: 20px;color: white;padding:10px;"><span class="glyphicon glyphicon-apple"></span>水果商城后台</a>
        <a style="color: red;text-decoration:none;font-size: 18px;padding:10px;" href="/login/exit"><span class="glyphicon glyphicon-off"></span> 退出登录</a>
    </div>

    <div class="left">
        <ul class="list-group">
            <li class="list-group-item"><a href="javascript:itemCategory()"><span class="glyphicon glyphicon-triangle-right"></span>类目管理</a></li>
            <li class="list-group-item"><a href="javascript:user()"><span class="glyphicon glyphicon-triangle-right"></span>用户管理</a></li>
            <li class="list-group-item"><a href="javascript:item()"><span class="glyphicon glyphicon-triangle-right"></span>商品管理</a></li>
            <li class="list-group-item"><a href="javascript:itemOrder()"><span class="glyphicon glyphicon-triangle-right"></span>订单管理</a></li>
            <li class="list-group-item"><a href="javascript:news()"><span class="glyphicon glyphicon-triangle-right"></span>公告管理</a></li>
            <li class="list-group-item"><a href="javascript:message()"><span class="glyphicon glyphicon-triangle-right"></span>留言管理</a></li>
        </ul>
    </div>

    <div class="main">
        <iframe id="iframe" scrolling="auto" frameborder="0/1" name="name" src="/login/welcome" width="100%" height="100%"></iframe>
    </div>

    <script>
        function itemCategory() {
            $("#iframe").attr("src", "/itemCategory/itemCategory");
        }
        function user() {
            $("#iframe").attr("src", "/user/user");
        }
        function item() {
            $("#iframe").attr("src", "/item/item");
        }
        function itemOrder() {
            $("#iframe").attr("src", "/itemOrder/itemOrder");
        }
        function news() {
            $("#iframe").attr("src", "/news/news");
        }
        function message() {
            $("#iframe").attr("src", "/message/message");
        }
    </script>
</body>
</html>
