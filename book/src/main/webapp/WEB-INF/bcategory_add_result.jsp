<%--
  Created by IntelliJ IDEA.
  User: yes
  Date: 2019/11/19
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>书籍分类添加结果页面</title>
</head>
<body>
<c:choose>
    <c:when test="${rows==1}">
        添加成功<a href="/admin/bcategory_add.action">继续添加</a>
        <a href="/bcategory/queryBcategory">查看书籍分类</a>
    </c:when>
    <c:otherwise>
        服务器异常
    </c:otherwise>
</c:choose>
</body>
</html>
