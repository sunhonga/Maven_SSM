<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>股票页面</title>
</head>
<body>
    ${msg}
    <table width="100%" border=1>
        <tr>
            <td>股票名称</td>
            <td>股票代码</td>
            <td>股票综合板块</td>
            <td>股票明细板块</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${guPiaoInfoList }" var="guPiao" varStatus="status">
            <tr>
                <td><input type="checkbox" name="ids" value="${guPiao.gpdm}"></td>
                    <%-- <td>${item.name }</td>
                    <td>${item.price }</td>
                    <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td>${item.detail }</td>
                    <td><a href="${pageContext.request.contextPath }/itemEdit.action?id=${item.id}">修改</a></td>
                 --%>
                <td>
                    <input type="hidden" name="items[${status.index }].id" value="${guPiao.gpdm}">
                    <input type="text" name="items[${status.index }].name" value="${guPiao.gpmc}"></td>
                <td><input type="text" name="items[${status.index }].mxbk" value="${guPiao.mxbk }"></td>
                <td><a href="${pageContext.request.contextPath }/guPiaoEdit.do?id=${guPiao.gpdm}">修改</a>

            </tr>
        </c:forEach>

    </table>
</body>
</html>