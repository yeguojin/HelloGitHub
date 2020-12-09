<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/2
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>转账操作</h1>
<form action="/account/transfer">
    转账人:<input type="text" name="from"><br>
    收账人:<input type="text" name="to"><br>
    金额:<input type="text" name="money"><br>
    <input type="submit" value="转账"><br>
</form>
</body>
</html>
