<%--
  Created by IntelliJ IDEA.
  User: wanglei
  Date: 16/7/28
  Time: 下午12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${message}<br>
    ${content}<br>
    <!--这里想加一个控制 if model中存在'name' 'age'属性 就显示下面这个div 否则不显示 现在我不知道这个控制怎么写-->
    <div>
        名字:${name}<br>
        年龄:${age}<br>
    </div>


</body>
</html>
