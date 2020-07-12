<%@ page import="com.github.pagehelper.Page" %>
<%@ page import="com.yohann.utils.Pager" %>
<%@ page import="com.yohann.entity.ItemCategory" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/master/master.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/11
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>类目管理</title>
</head>
<body>
    <div class="right">
        <div class="add" style="height: 10%;margin:10px 20px 0px 20px;">
            <button type="button" class="btn btn-light"><span class="glyphicon glyphicon-plus"></span> 添加分类</button>
        </div>
        <div class="table" style="height: 70%;border: #0f0f0f 4px;">
            <table class="table" style="text-align: center;font-size: 15px;">
                <thead>
                <tr>
                    <th scope="col">编号</th>
                    <th scope="col">名称</th>
                    <th scope="col">二级编号</th>
                    <th scope="col">是否删除</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${result.rows}" var="itemCategory">
                <tr>
                    <th>${itemCategory.id}</th>
                    <td>${itemCategory.name}</td>
                    <td>${itemCategory.pid}</td>
                    <td>${itemCategory.isDelete}</td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="page" style="text-align: center;height: 10%;">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <c:forEach var="i" begin="1" end="${result.total}" step="1">
                        <c:if test="${result.pageNo == i}">
                            <li><a style="color: #8c8c8c;">${i}</a></li>
                        </c:if>
                        <c:if test="${result.pageNo != i}">
                            <li><a href="/itemcategory/itemcategory?pageNo=${i}">${i}</a></li>
                        </c:if>
                    </c:forEach>
                </ul>
            </nav>
        </div>
    </div>
</body>
</html>
