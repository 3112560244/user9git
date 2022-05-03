<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/3
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <h2 style="color: red">${error}</h2>
    <form:form modelAttribute="mail" action="${pageContext.request.contextPath}/mail/login" method="post">
        <table>
            <caption>邮箱登陆界面</caption>
            <tr><td>E-mail地址：</td>
                <td>
                    <form:input path="mailName"/>
                    <form:errors cssStyle="color: red" path="mailName"/>
                </td>
            </tr>
            <tr><td>E-mail密码：</td>
                <td>
                    <form:input path="mailPwd"/>
                    <form:errors cssStyle="color: red" path="mailPwd"/>
                </td>
            </tr>
            <tr><td colspan="2" align="center"><input type="submit" value="登陆邮箱"></td></tr>
        </table>
    </form:form>
</body>
</html>
