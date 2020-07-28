<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>hello spring springmvc mybatis 4.0 </h2>

<c:if test="${not empty users}">
    <c:forEach items="${users}" var="user">
        <p>${user.id} --- ${user.name} -- ${user.age}</p>
    </c:forEach>
</c:if>
<a href="/add"> 去添加 </a>
<img src="/static/images/down.jpg">
</body>
</html>
