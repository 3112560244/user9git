<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/5/9
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书列表json</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
    </script>
    <script type="text/javascript">
        $(function (){
            $("#btn1").click(function(){
                var bookId = $("#bookId").val();
                var bookName = $("#bookName").val();
                var author = $("#author").val();

                $.ajax({
                    url:"${pageContext.request.contextPath}/json/testResponseBody",
                    contentType:"application/json",
                    dataType:"json",
                    type:"post",
                    data:JSON.stringify({"bookId":bookId,"bookName":bookName,"author":author}),
                    success:function (data){
                        $("#tabBooks").empty();
                        $.each(data,function(index,book){
                            var trNode = $("<tr align = 'center'/>");
                            $("<td />").html(index+1).appendTo(trNode);
                            $("<td />").html(book.bookId).appendTo(trNode);
                            $("<td />").html(book.bookName).appendTo(trNode);
                            $("<td />").html(book.author).appendTo(trNode);
                            $("#tabBooks").append(trNode)
                        });
                    }
                });
            });
        });
    </script>
</head>
<body>
    <form>
        <table border="1" width="50%">
            <tr>
                <td>图书编号</td>
                <td><input type="text" name="bookId" id="bookId"></td>
            </tr>
            <tr>
                <td>图书名称</td>
                <td><input type="text" name="bookName" id="bookName"></td>
            </tr>
            <tr>
                <td>图书作者</td>
                <td><input type="text" name="author" id="author"></td>
            </tr>
            <tr><td colspan="2" align="center"> <input type="button" value="添加图书" id="btn1"></td></tr>
        </table>
    </form>
现有的图书信息如下：
<table border="1" width="50%" id="tabBooks"></table>
</body>
</html>
