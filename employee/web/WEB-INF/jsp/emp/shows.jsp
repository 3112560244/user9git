<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: 31125
  Date: 2022/4/28
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>显示员工信息的页面</title>
  </head>
  <body>
    <table border="1" width="80%" style="text-align:center">
      <tr>
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>员工性别</th>
        <th>员工兴趣爱好</th>
        <th>员工所在部门</th>
        <th>员工角色</th>
        <th>最高学历</th>
        <th>个人简历</th>
        <th>操作</th>
      </tr>

      <c:forEach items="${emps}" var="emp">
        <tr>
          <td>${emp.empId}</td>
          <td>${emp.name}</td>
          <td>${emp.gender?"男":"女"}</td>
          <td>${fn:join(emp.hobby,",")}</td>
          <td>${emp.dept}</td>
          <td>${emp.roles}</td>
          <td>${emp.qualification}</td>
          <td>${emp.resume}</td>
          <td><a href="${pageContext.request.contextPath}/emp/update/${emp.empId}">修改</a></td>
        </tr>
      </c:forEach>

    </table>
  </body>
</html>
