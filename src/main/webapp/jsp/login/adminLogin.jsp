<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/8
  Time: 18:19
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
    <title>管理员登录</title>
</head>
<body  style="background-color: rgb(126,222,222);">
    <form action="/login/adminToLogin" method="post">
        <div class="container">
            <div  style="text-align:center;margin-top:5%;margin-bottom:5%;">
                <h1>管理员登录</h1>
            </div>

            <div style="background-color: rgb(91,192,222);">
                <div class="row"  style="text-align: center">
                    <div class="col-xs-3">
                    </div>
                    <div class="col-xs-6" style="font-size:20px;margin-top:5%;margin-bottom:5%;">
                        <i class="fa fa-user" aria-hidden="true" style="font-size:25px;">&nbsp;</i><input type="text" name="userName" value="admin">
                    </div>
                    <div class="col-xs-3">
                    </div>
                </div>

                <div class="row" style="text-align: center">
                    <div class="col-xs-3">
                    </div>
                    <div class="col-xs-6"  style="font-size:20px;text-align: center">
                        <i class="fa fa-lock" aria-hidden="true" style="font-size:25px;">&nbsp;</i><input type="password" name="passWord" value="111111">
                    </div>
                    <div class="col-xs-3">
                    </div>
                </div>

                <div class="row"  style="text-align: center">
                    <div class="col-xs-3">
                    </div>
                    <div class="col-xs-6"  style="font-size:20px;text-align:center;margin-top:5%;margin-bottom:5%;">
                        <i class="fa fa-sign-in" aria-hidden="true">&nbsp;</i><input type="submit" value="登录">
                    </div>
                    <div class="col-xs-3">
                    </div>
                </div>
            </div>
        </div>
    </form>
</body>
</html>
