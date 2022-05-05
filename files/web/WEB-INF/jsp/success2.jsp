<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/5
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success2</title>
</head>
<body>
    <c:forEach items="${uploadFiles}" var="uploadFile" varStatus="status">
        上传文件${status.count}的名称:${uploadFile.originalFilename}<br>
        上传文件${status.count}的内容类型:${uploadFile.contentType}<br>
        上传文件${status.count}的大小:${uploadFile.size}<br>
        第[${status.count}]上传文件的描述:${fileDesc[status.count-1]}<br>
    </c:forEach>
</body>
</html>
