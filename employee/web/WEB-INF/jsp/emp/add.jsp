<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fprm" uri="http://www.springframework.org/tags/form" %>
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
    <title>添加页面</title>
  </head>
  <body>
  <form:form modelAttribute = "emp" action="${pageContext.request.contextPath}/emp/add" method="post">
    <table border="1" width="65%">
      <tr><td>员工编号</td><td><form:input path="empId"/> </td></tr>
      <tr><td>员工姓名</td><td><form:input path="name"/> </td></tr>
      <tr>
        <td>员工性别</td>
        <td><form:radiobuttons path="gender" items="${genderMap}"/></td>
      </tr>
      <tr><td>兴趣爱好</td>
        <td><form:checkboxes path="hobby" delimiter="&nbsp;&nbsp;&nbsp;" items="${allHobby}"/></td>
      </tr>
      <tr>
        <td>所在部门</td>
        <td><form:select  path="dept">
          <form:options items="${depts}"/>
        </form:select ></td>
      </tr>

      <tr>
        <rd>具有的角色</rd>
        <td>
          <form:select path="qualification">
            <form:options items="${qualifications}"/>
          </form:select>
        </td>
      </tr>

      <tr>
        <td>个人简历</td>
        <td><form:textarea path="resume" cols="50" rows="10"/></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" value="添加新员工"></td>
      </tr>

    </table>
  </form:form>
  </body>
</html>
