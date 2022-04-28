<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/4/28
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form action="/test/login" method="post">
        <table cellpadding="1" >
            <th><td colspan="2">登陆</td></th>
            <tr><td>用户名:</td><td><input type="text" name="name"></td></tr>
            <tr><td>密 码:</td><td><input type="text" name="pwd"></td></tr>
            <tr><td colspan="2"><input type="submit" >提交</td></tr>
        </table>
    </form>
</body>
</html>
