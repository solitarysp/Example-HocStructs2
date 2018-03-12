<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chi Can Em
  Date: 12-03-2018
  Time: 08:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="addProduct" method="POST">
    name: <s:textfield name="product.name"></s:textfield>
    <s:submit>gui</s:submit>
    <s:textfield hidden="hidden" name="action" value="add"></s:textfield>
</s:form>
</body>
</html>
