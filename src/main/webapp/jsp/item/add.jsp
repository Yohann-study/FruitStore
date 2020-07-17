<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/16
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/master/master.jsp"%>
<html>
<head>
    <title>新增商品</title>
</head>
<body  style="background-color: #9acfea;">
<div class="right" style="text-align: center;">
    <div>
        <h3>添加商品</h3>
    </div>
    <form action="/item/exAdd" method="post" enctype="multipart/form-data">
<%--        <table style="margin: auto;border-collapse:separate; border-spacing:10px;">--%>
<%--            <tr>--%>
<%--                <td>商品名称：</td>--%>
<%--                <td><input type="text" name="name"></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>商品价格：</td>--%>
<%--                <td><input type="text" name="price"></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>商品折扣：</td>--%>
<%--                <td><input type="text" name="zk"></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>商品类别：</td>--%>
<%--                <td>--%>
<%--                    <select name="categoryIdTwo">--%>
<%--                        <c:forEach items="${itemCategories2}" var="data" varStatus="l">--%>
<%--                            <option value="${data.id}">${data.name}</option>--%>
<%--                        </c:forEach>--%>
<%--                    </select>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>主图：</td>--%>
<%--                <td><input type="file" name="file"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>副图1：</td>--%>
<%--                <td><input type="file" name="file"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>副图2：</td>--%>
<%--                <td><input type="file" name="file"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>副图3：</td>--%>
<%--                <td><input type="file" name="file"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>副图4：</td>--%>
<%--                <td><input type="file" name="file"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>描述：</td>--%>
<%--                <td><input type="text" name="ms" /></td>--%>
<%--            </tr>--%>
<%--        </table>--%>
    <td>上传图片：</td>
                <td><input type="file" name="file" /></td>
        <input type="submit" value="添加">
    </form>
</div>
</body>
</html>
