<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/4
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    普通上传字段信息:<br>
    上传者姓名:${fileUploadManager.uploadAuthor}<br>
    上传文件信息:<br>
    上传文件名称:${fileUploadManager.uploadFile.originalFilename}<br>
    上传文件的内容类型:${fileUploadManager.uploadFile.contentType}<br>
    上传文件的大小:${fileUploadManager.uploadFile.size}<br>
</body>
</html>
