<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/3
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
    <h2>邮箱首页</h2>
    <h3>用户:${mail.mailName}</h3>
    <ol>
        <li><a href="${pageContext.request.contextPath}/mail/send">发送邮件</a> </li>
        <li><a href="${pageContext.request.contextPath}/mail/receive">接受邮件</a> </li>
    </ol>
</body>
</html>
