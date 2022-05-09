<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/9
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发送json数据</title>

<%--    <script type="text/javascript" src="../js/jquery-1.12.4.js"></script>--%>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
    </script>
    <script type="text/javascript">


        $(function (){
            $.ajax({
                url:"${pageContext.request.contextPath}/json/testRequestBody",
                dataType:"json",
                type:"post",
                contentType:"application/json",
                data:JSON.stringify({"bookId":"10001","bookName":"java ee","author":"李晓明"}),
                success:function (data){
                    $("#bookId").html(data.bookId);
                    $("#bookName").html(data.bookName);
                    $("#author").html(data.author);
                },
                error:function (){
                    alert("数据发送失败！");
                }

            });
        });
    </script>


</head>
<body>
    图书编号：<span id="bookId"></span><br>
    图书名称：<span id="bookName"></span><br>
    图书作者：<span id="author"></span><br>
</body>
</html>
