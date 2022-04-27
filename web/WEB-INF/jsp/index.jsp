<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/4/26
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是主页哦</title>
</head>
<body>
<table border="1" width="550px">
    <tr>
        <th>用户编号</th>
        <th>用户姓名</th>
        <th>用户性别</th>
        <th>用户电话</th>
        <th>用户操作</th>
    </tr>
    <c:choose>
        <c:when test="${!empty(users)}">
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.uid}</td>
                    <td>${user.name}</td>
                    <td>${user.gender}</td>
                    <td>${user.mobile}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/user/update?uid=${user.uid}">修改</a>
                        <a href="${pageContext.request.contextPath}/user/delete?uid=${user.uid}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td colspan="5" align="center">对不起,当前库中没有任何用户信息</td>
            </tr>
        </c:otherwise>
    </c:choose>
    <tr>
        <td colspan="5" align="right">
            <a href="${pageContext.request.contextPath}/user/add">添加用户</a>
        </td>
    </tr>

</table>
</body>
</html>
