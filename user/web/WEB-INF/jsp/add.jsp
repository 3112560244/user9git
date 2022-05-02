<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/2
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="user" action="${pageContext.request.contextPath}/add" method="post">
        <table border="1" width="50">
            <tr>
                <td>用户编号:</td><td><form:input path="id" value=""/></td>
            </tr>
            <tr>
                <td>用户姓名:</td><td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>用户性别:</td><td><form:radiobuttons path="sex" items="${sexMap}"/></td>
            </tr>
            <tr>
                <td>用户出生日期:</td><td><form:input path="birthday" />格式:yyyy-MM-dd</td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="添加新用户"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
