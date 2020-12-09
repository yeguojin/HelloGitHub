<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/2
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>添加账户</h1>
    <form action="/account/add">
        账户名称:<input type="text" name="name"><br>
        账户金额:<input type="text" name="money"><br>
        <input type="submit" value="添加"><br>
    </form>
</body>
</html>
