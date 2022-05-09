<%@ page import="java.net.URLEncoder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/6
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示所有的下载文件</title>
</head>
<body>
    <table border="1" width="70">
        <tr><th>编号</th><th>文件名称</th><th>下载操作</th></tr>
        <c:choose>
            <c:when test="${!empty(fileNames)}">
                <c:forEach items="${fileNames}" var="fileName" varStatus="status">
                    <tr>
                        <td>${status.index+1}</td>
                        <td>${fileName}</td>


                    <td><a href="${pageContext.request.contextPath}/download/down?filename=${fileName}">下载</a> </td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr><td colspan="3">对不起,没有可供下载的文件</td></tr>
            </c:otherwise>
        </c:choose>
    </table>
</body>
</html>
