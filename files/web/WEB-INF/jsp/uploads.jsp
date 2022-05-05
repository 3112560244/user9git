<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/5
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>uploads</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/upload/more" enctype="multipart/form-data" method="post">
        文件1：<input type="file" name="uploadFiles"/><br>
        上传文件描述：<input type="text" name="fileDesc"/><br>
        文件2：<input type="file" name="uploadFiles"/><br>
        上传文件描述：<input type="text" name="fileDesc"/><br>
        文件3：<input type="file" name="uploadFiles"/><br>
        上传文件描述：<input type="text" name="fileDesc"/><br>
        <input type="submit" value="提交上传"/>
    </form>
</body>
</html>
