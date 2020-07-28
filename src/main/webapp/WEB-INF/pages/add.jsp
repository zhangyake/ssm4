<%--
  Created by IntelliJ IDEA.
  User: jaak
  Date: 2020/6/23
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<div>  添加用户 </div>
<form action="/user/add" method="post">
    <label for="name" > 名字: <input type="text" id="name" name="name" value=""></label>
    <label for="age" >年龄: <input type="text" id="age" name="age" value=""></label>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
