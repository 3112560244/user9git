<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/3
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>customer</title>
</head>
<body>
    <form:form modelAttribute="customer" action="${pageContext.request.contextPath}/customer/add" method="post">
        <table border="1" width="70%">
            <tr>
                <td>客户登录名称：</td>
                <td>
                    <form:input path="loginName"/>
                    <form:errors path="loginName" cssStyle="color: red"/>
                </td>
            </tr>
            <tr>
                <td>客户登陆密码：</td>
                <td>
                    <form:radiobuttons path="sex" items="${sexMap}"/>
                </td>
            </tr>
            <tr>
                <td>客户年龄：</td>
                <td>
                    <form:input path="age"/>
                    <form:errors path="age" cssStyle="color: red"/>
                </td>
            </tr>
            <tr>
                <td>客户邮箱：</td>
                <td>
                    <form:input path="email"/>
                    <form:errors path="email" cssStyle="color: red"/>
                </td>
            </tr>
            <tr>
                <td>客户生日：</td>
                <td>
                    <form:input path="birthday"/>
                    <form:errors path="birthday" cssStyle="color: red"/>
                </td>
            </tr>
            <tr>
                <td>客户联系电话：</td>
                <td>
                    <form:input path="phone"/>
                    <form:errors path="phone" cssStyle="color: red"/>
                </td>
            </tr>
            <tr><td colspan="2" align="center"><input type="submit" value="注册新客户"></td></tr>
        </table>
    </form:form>
</body>
</html>
