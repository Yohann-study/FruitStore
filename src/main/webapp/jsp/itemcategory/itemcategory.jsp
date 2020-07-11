<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <jsp:include page="#{root}/master/admin-master.jsp"></jsp:include>
    <div class="right">
        <c:forEach items="${list}" var="data">
            ${data.id}<br>
            ${data.name}<br>
            ${data.pid}<br>
            ${data.isDelete}<br>
            --------------------<br>
        </c:forEach>
    </div>
</body>
</html>
