<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/8
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/master.jsp"%>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
<form action="/login/adminToLogin" method="post">
    <div class="container">
        <div  style="text-align:center;margin-top:5%;margin-bottom:5%;">
            <h1>管理员登录</h1>
        </div>

        <div class="row">
            <div class="col-sm-4">
            </div>
            <div class="col-sm-4" style="font-size:30px;margin-top:5%;margin-bottom:5%;">
                账号：<input type="text" name="userName" value="admin">
            </div>
            <div class="col-sm-4">
            </div>
        </div>

        <div class="row">
            <div class="col-sm-4">
            </div>
            <div class="col-sm-4"  style="font-size:30px;">
                密码：<input type="password" name="passWord" value="111111">
            </div>
            <div class="col-sm-4">
            </div>
        </div>

        <div class="row">
            <div class="col-sm-4">
            </div>
            <div class="col-sm-4"  style="font-size:30px;text-align:center;margin-top:5%;margin-bottom:5%;">
                <input type="submit" value="登录">
            </div>
            <div class="col-sm-4">
            </div>
        </div>

        <div class="row">
            <div class="col-sm-4">
            </div>
            <div class="col-sm-4"  style="font-size:30px;text-align:center;">
                <asp:Label ID="Label1" runat="server" ForeColor="Red"></asp:Label>
            </div>
            <div class="col-sm-4">
            </div>
        </div>
    </div>
</form>
</body>
</html>
