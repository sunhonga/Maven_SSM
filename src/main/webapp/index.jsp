<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Maven_ssm</title>
    <script type="text/javascript" src="jsp/jquery-1.6.js"></script>
    <script type="text/javascript" src="jsp/zqzlb_json.js"></script>
    <script type="text/javascript" src="jsp/tx_test.js"></script>
</head>
<body>
<h2>Hello World!</h2>
证券类别：
<select name="zqlb" id ="zqlb">
    <option value="" >-请选择 -</option>
    <option value="1" >股票</option>
    <option value="2" >债券</option>
    <option value="3" >基金</option>
</select>
证券子类别：
<select name="subzqlb" id="subzqlb">
    <option value="" >-请选择 -</option>
</select>
<textarea rows="3" cols="20" id="zqlbtextarea">
sdsdsdsdsd
</textarea>
<button id="tx_test" type="button">测试转账事务</button>
<a id="guPiao" href="${pageContext.request.contextPath }/guPiao.do">点我去股票页面happy</a>
<a id="zhaiQuan" href="${pageContext.request.contextPath }/zhaiQuan.do">点我去债券页面happy</a>
<a id="jiJin" href="${pageContext.request.contextPath }/jiJin.do">点我去基金页面happy</a>

<%--联系springMVC--%>



<%--<button id="search1" type="button">单表多入参查询</button>
<button id="search2" type="button">多表关联查询</button>--%>
</body>
</html>

<script>

    $("#search1").click(function () {
        $.post(
            "getCszqxx.do",
            {fjjdm:1907,fzqmc:"18北京"},
            function (data,status) {
                alert(JSON.stringify(data));
            },"json");
    });

</script>