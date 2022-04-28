<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>修改员工界面</title>
  </head>
  <body>
    <form:form modelAttribute="emp" action="${pageContext.request.contextPath}/emp/add" method="post">
      <table border="1" width="65%">
        <tr>
          <td>用户编号</td>
          <td><form:input path="empId"/></td>
        </tr>

        <tr>
          <td>用户姓名</td>
          <td><form:input path="name"/></td>
        </tr>

        <tr>
          <td>用户性别</td>
          <td><form:radiobuttons path="gender" items="${genderMap}"/></td>
        </tr>

        <tr>
          <td>兴趣爱好</td>
          <td><form:checkboxes path="hobby" items="${allHobby}" delimiter="&nbsp;&nbsp;&nbsp;"/></td>
        </tr>

        <tr>
          <td>所在部门</td>
          <td>
            <form:select path="dept">
             <form:options items="${depts}"/>
            </form:select>
          </td>
        </tr>

        <tr>
          <td>具有的角色</td>
          <td><form:checkboxes path="roles" items="${roles}" delimiter="&nbsp;&nbsp;&nbsp;"/></td>
        </tr>

        <tr>
          <td>最高学历</td>
          <td>
            <form:select path="qualification">
              <form:options items="${qualification}"/>
            </form:select>
          </td>
        </tr>

        <tr>
          <td>个人简历</td>
          <td><form:textarea path="resume" cols="50" rows="10"/></td>
        </tr>

        <tr>
          <td colspan="2" headers="center">
            <input type="submit" value="修改员工信息">
          </td>
        </tr>

      </table>
    </form:form>
  </body>
</html>
