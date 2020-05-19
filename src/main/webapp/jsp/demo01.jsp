<%--
  Created by IntelliJ IDEA.
  User: sunhong
  Date: 2019-1-12
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        function load() {
            $("#text01").load("/selectUserAsJson");
        }
    </script>
</head>
<body>
    <h3><a href="" onlick="load()">使用JQuery执行load方法</a></h3>
    <input type="text" id="text01">
</body>
</html>
