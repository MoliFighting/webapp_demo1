<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wanglei
  Date: 16/7/28
  Time: 下午3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    html form get方式:
    <form action="/hello/infoget" method="get">
        <input type="text" name="name" ><br>
        <input type="text" name="age"><br>
        <input type="submit">
    </form>
    <br>
    html form post方式:
    <br>
    <form action="/hello/infopost" method="post">
        <input type="text" name="name" ><br>
        <input type="text" name="age"><br>
        <input type="submit">
    </form>
    <br>
    spring mvc form:可以直接读取后台传输进来的实例(user)
    <br>
    <form:form action="/hello/infopost" method="post" modelAttribute="user">
        name:<form:input path="name"/><br>
        age: <form:input path="age"/>
        <input type="submit">
    </form:form>

</body>
</html>
