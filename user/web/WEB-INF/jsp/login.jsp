<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="forn" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/3
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form:form modelAttribute="loginUser" action="${pageContext.request.contextPath}/login" method="post">
        <table border="1" width="45%">
            <tr>
                <td>用户名称:</td>
                <td>
                    <form:input path="userName" />
                    <form:errors path="userName" cssStyle="color:red"/>
                </td>
            </tr>

            <tr>
                <td>登陆密码:</td>
                <td>
                    <form:input path="password"/>
                    <forn:errors path="password" cssStyle="color:red"/>
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="用户登录"></td>
            </tr>
        </table>





    </form:form>


</body>
</html>
