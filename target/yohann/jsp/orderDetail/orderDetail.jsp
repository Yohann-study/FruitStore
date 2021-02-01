<%--
  Created by IntelliJ IDEA.
  User: Yohann
  Date: 2020/7/17
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/master/master.jsp"%>
<html>
<head>
    <title>订单细节</title>
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
        <div class="table" style="height: 80%;border: #0f0f0f 4px;">
            <%--数据表--%>
            <table class="table" style="text-align: center;font-size: 15px;">
                <thead>
                <tr>
                    <th scope="col">商品名称</th>
                    <th scope="col">商品主图</th>
                    <th scope="col">商品单价</th>
                    <th scope="col">购买数量</th>
                    <th scope="col">小计</th>
                    <th scope="col">状态</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${result.rows}" var="data">
                    <tr style="font-size: 13px;">
                        <td>${data.item.name}</td>
                        <td><img src="${data.item.url1}" alt="" style="width: 50px;height: 50px;"></td>
                        <td>${data.item.price}</td>
                        <td>${data.num}</td>
                        <td>${data.total}</td>
                        <td style="color: red">
                            <c:if test="${data.status == 0}">
                                未退货
                            </c:if>
                            <c:if test="${data.status == 1}">
                                已退货
                            </c:if>
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
                                    <li><a href="/orderDetail/orderDetail?pageNo=${i}&orderId=${id}">${i}</a></li>
                                </c:if>
                            </c:forEach>
                        </c:when>

                        <c:when test="${result.pageNo < 4 && result.total > 5}">
                            <c:forEach var="i" begin="1" end="5" step="1">
                                <c:if test="${result.pageNo == i}">
                                    <li><a style="color: red;">${i}</a></li>
                                </c:if>
                                <c:if test="${result.pageNo != i}">
                                    <li><a href="/orderDetail/orderDetail?pageNo=${i}&orderId=${id}">${i}</a></li>
                                </c:if>
                            </c:forEach>
                        </c:when>

                        <c:when test="${result.total > 5 && result.pageNo > 3 && (result.total-result.pageNo) >= 2}">
                            <c:forEach var="i" begin="${result.pageNo-2}" end="${result.pageNo+2}" step="1">
                                <c:if test="${result.pageNo == i}">
                                    <li><a style="color: red;">${i}</a></li>
                                </c:if>
                                <c:if test="${result.pageNo != i}">
                                    <li><a href="/orderDetail/orderDetail?pageNo=${i}&orderId=${id}">${i}</a></li>
                                </c:if>
                            </c:forEach>
                        </c:when>

                        <c:when test="${(result.total-result.pageNo) < 2}">
                            <c:forEach var="i" begin="${result.total-4}" end="${result.total}" step="1">
                                <c:if test="${result.pageNo == i}">
                                    <li><a style="color: red;">${i}</a></li>
                                </c:if>
                                <c:if test="${result.pageNo != i}">
                                    <li><a href="/orderDetail/orderDetail?pageNo=${i}&orderId=${id}">${i}</a></li>
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
