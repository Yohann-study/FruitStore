<%@ page import="com.yohann.utils.mySession" %>
<%@ page import="com.yohann.entity.Manage" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<c:set var="imagesRoot" value="${pageContext.request.contextPath}/resource/upload/images/items"/>
<script>
    var root = "${root}";
    var imagesRoot = "${imagesRoot}";
</script>

<!-- 导入bootstrap框架 -->
<link rel="stylesheet" href="${root}/resource/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" href="${root}/resource/font-awesome/css/font-awesome.min.css">
<script src="${root}/resource/bootstrap-3.3.7-dist/jQuery/jquery-1.11.0.js"></script>
<script src="${root}/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>

<%
    Manage manage = (Manage)request.getSession().getAttribute(mySession.MANAGE);
    if (manage.getRealName() == null){
        response.sendRedirect("/login/exit");
    }
%>