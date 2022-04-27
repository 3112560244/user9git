<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/4/26
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<h1> 添加用户界面</h1>
<form action="${pageContext.request.contextPath}/user/add" method="post">
    <table border="1" width="500px">
        <tr>
            <td>用户编号:</td>
            <td><input type="text" name="uid"></td>
        </tr>
        <tr>
            <td>用户姓名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>用户性别:</td>
            <td>
                <input type="radio" name="gender" value="男">男
                <input type="radio" name="gender" value="女">女
            </td>
        </tr>

        <tr>
            <td>用户电话:</td>
            <td><input type="text" name="mobile"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="添加用户"></td>
        </tr>
    </table>
</form>
</body>
</html>
