<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/4
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/upload/simple" method="post" enctype="multipart/form-data">
        上传文件作者:<input type="text" name="uploadAuthor"/>
        选择上传的文件:<input TYPE="file" name="uploadFile"/>
        <input type="submit" value="提交上传"/>
    </form>
</body>
</html>
