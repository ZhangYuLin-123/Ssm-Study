<%--
  Created by IntelliJ IDEA.
  User: zyl
  Date: 2022/7/5
  Time: 0:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/mvc/param2", method="post">
        <input type="text" name="userList[0].name"/><br>
        <input type="text" name="userList[0].age"/><br>
        <input type="text" name="userList[1].name"/><br>
        <input type="text" name="userList[1].age"/><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
