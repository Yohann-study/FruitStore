<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/master/master.jsp"%>
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
    .right{
        width: 80%;
        height: 90%;
        float: left;
        background-color: #9acfea;
    }
</style>
<div class="container-fluid"  style="background-color: rgb(91,192,222);padding:20px;height: 10%;">
    <a style="pointer-events: none;border: none;font-size: 20px;margin-left: 20px;margin-right: 20px;color: white;padding:10px;"><span class="glyphicon glyphicon-apple"></span>水果商城后台</a>
    <a style="color: green;text-decoration:none;font-size: 18px;padding:10px;"><span class="glyphicon glyphicon-home"></span> 前台首页</a>
    <a style="color: orange;text-decoration:none;font-size: 18px;padding:10px;"><span class="glyphicon glyphicon-trash"></span> 清除缓存</a>
    <a style="color: red;text-decoration:none;font-size: 18px;padding:10px;" href="/login/exit"><span class="glyphicon glyphicon-off"></span> 退出登录</a>
</div>
<div class="left" style="text-align: center;width: 20%;height: 90%;float: left;">
    <ul class="list-group">
        <li class="list-group-item"><a href="/itemcategory/itemcategory"><span class="glyphicon glyphicon-triangle-right"></span>类目管理</a></li>
        <li class="list-group-item"><a><span class="glyphicon glyphicon-triangle-right"></span>用户管理</a></li>
        <li class="list-group-item"><a><span class="glyphicon glyphicon-triangle-right"></span>商品管理</a></li>
        <li class="list-group-item"><a><span class="glyphicon glyphicon-triangle-right"></span>订单管理</a></li>
        <li class="list-group-item"><a><span class="glyphicon glyphicon-triangle-right"></span>公告管理</a></li>
        <li class="list-group-item"><a><span class="glyphicon glyphicon-triangle-right"></span>留言管理</a></li>
    </ul>
</div>