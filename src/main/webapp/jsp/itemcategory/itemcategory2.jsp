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
    <style>
        th{
            text-align: center;
            border: #0f0f0f;
        }
        td{
            text-align: center;
            border: #0f0f0f;
        }
        a span{
            margin-left: 20px;
        }
    </style>
</head>
<body  style="background-color: #9acfea;">
    <div class="right">
        <div class="add" style="height: 8%;margin:15px 20px 0px 20px;font-size: 18px;">
            <%--功能区域--%>
            <a href="/itemcategory/add2?pid=${pid}"><span class="glyphicon glyphicon-plus"></span> 添加二级分类</a>
        </div>
        <div class="table" style="height: 70%;border: #0f0f0f 4px;">
            <%--数据表--%>
            <table class="table" style="text-align: center;font-size: 15px;">
                <thead>
                <tr>
                    <th scope="col">编号</th>
                    <th scope="col">名称</th>
                    <th scope="col">操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${result.rows}" var="itemCategory">
                    <tr style="font-size: 13px;">
                        <td>${itemCategory.id}</td>
                        <td>${itemCategory.name}</td>
                        <td>
                            <a href="/itemcategory/update2?id=${itemCategory.id}"><span class="glyphicon glyphicon-pencil"></span> 修改 &nbsp;</a>
                            <a href="/itemcategory/delete2?id=${itemCategory.id}&pid=${itemCategory.pid}"><span class="glyphicon glyphicon-trash"></span> 删除 &nbsp;</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="page" style="text-align: center;height: 10%;">
            <%--页码区域--%>
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <c:choose>
                        <c:when test="${result.pageNo < 4 && result.total < 6}">
                            <c:forEach var="i" begin="1" end="${result.total}" step="1">
                                <c:if test="${result.pageNo == i}">
                                    <li><a style="color: red;">${i}</a></li>
                                </c:if>
                                <c:if test="${result.pageNo != i}">
                                    <li><a href="/itemcategory/itemcategory?pageNo=${i}">${i}</a></li>
                                </c:if>
                            </c:forEach>
                        </c:when>

                        <c:when test="${result.pageNo < 4 && result.total > 5}">
                            <c:forEach var="i" begin="1" end="5" step="1">
                                <c:if test="${result.pageNo == i}">
                                    <li><a style="color: red;">${i}</a></li>
                                </c:if>
                                <c:if test="${result.pageNo != i}">
                                    <li><a href="/itemcategory/itemcategory?pageNo=${i}">${i}</a></li>
                                </c:if>
                            </c:forEach>
                        </c:when>

                        <c:when test="${result.total > 5 && result.pageNo > 3 && (result.total-result.pageNo) >= 2}">
                            <c:forEach var="i" begin="${result.pageNo-2}" end="${result.pageNo+2}" step="1">
                            <c:if test="${result.pageNo == i}">
                                <li><a style="color: red;">${i}</a></li>
                            </c:if>
                            <c:if test="${result.pageNo != i}">
                                <li><a href="/itemcategory/itemcategory?pageNo=${i}">${i}</a></li>
                            </c:if>
                        </c:forEach>
                        </c:when>

                        <c:when test="${(result.total-result.pageNo) < 2}">
                            <c:forEach var="i" begin="${result.total-4}" end="${result.total}" step="1">
                                <c:if test="${result.pageNo == i}">
                                    <li><a style="color: red;">${i}</a></li>
                                </c:if>
                                <c:if test="${result.pageNo != i}">
                                    <li><a href="/itemcategory/itemcategory?pageNo=${i}">${i}</a></li>
                                </c:if>
                            </c:forEach>
                        </c:when>
                    </c:choose>
                </ul>
            </nav>
        </div>
    </div>
</body>
</html>
