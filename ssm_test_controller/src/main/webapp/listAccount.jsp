<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/2
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>查询账户</h1>
    <table border="1">
        <tr>
            <td>账户ID</td>
            <td>账户名称</td>
            <td>账户金额</td>
        </tr>
        <c:forEach items="${pageBean.list}" var="account">
            <tr>
                <td>${account.id}</td>
                <td>${account.name}</td>
                <td>${account.money}</td>
            </tr>
        </c:forEach>
       
    </table>
</body>
</html>
