<%--
  Created by IntelliJ IDEA.
  User: yuyim
  Date: 2018/10/21
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<s:url value="/resources/style.css"/>" >
</head>
<body>
<div id="header">
    <t:insertAttribute name="body" />
</div>

<div id="content">
    <t:insertAttribute name="body" />
</div>
<div id="footer">
    <t:insertAttribute name="footer" />
</div>
</body>
</html>
