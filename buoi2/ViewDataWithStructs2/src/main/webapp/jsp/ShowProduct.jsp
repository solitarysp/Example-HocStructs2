<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chi Can Em
  Date: 12-03-2018
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <s:iterator var="item" value="products" >
        <tr>
            <td><s:property value="#item.id"></s:property></td>
            <td><s:property value="#item.name"></s:property></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
