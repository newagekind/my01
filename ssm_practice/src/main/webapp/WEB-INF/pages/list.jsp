<%--
  Created by IntelliJ IDEA.
  User: crowndint
  Date: 2018/8/25
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <table align="center">
        <tr><th>姓名</th><th>金额</th><th>图片</th></tr>
        <c:forEach items="${accounts}" var="account">
            <tr>
                <td>${account.name}</td>
                <td>${account.money}</td>
                <td><img src="${account.imgSrc}" width="80%" height="80%"></td>
            </tr>
        </c:forEach>
    </table>


    <a href="/addAccount.jsp">添加账户</a>

</body>
</html>
