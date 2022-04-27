<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/4/26
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
<h1>修改用户</h1>
<form action="${pageContext.request.contextPath}/user/update" method="post">
    <table border="1" width="500px">
        <tr>
            <td>用户编号:</td>
            <td><input type="text" name="uid" value="${user.uid}" disabled="disabled"></td>
        </tr>
        <input type="hidden" name="uid" value="${user.uid}">
        <tr>
            <td>用户姓名:</td>
            <td><input type="text" name="name" value="${user.name}"></td>
        </tr>
        <tr>
            <td>用户性别:</td>
            <td>
                <input type="radio" name="gender" value="男" ${user.gender =='男'?'checked':''}>男
                <input type="radio" name="gender" value="女" ${user.gender =='女'?'checked':''}>女
            </td>
        </tr>
        <tr>
            <td>用户电话:</td>
            <td><input type="text" name="mobile" value="${user.mobile}"></td>
        </tr>

        <tr>
            <td colspan="2" align="center"><input type="submit" value="修改用户"></td>
        </tr>

    </table>
</form>
</body>
</html>
