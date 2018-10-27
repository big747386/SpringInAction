<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yuyim
  Date: 2018/9/29
  Time: 0:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resourses/style.css"/>" >
</head>
<body>
<h1>Welcome to Spittr</h1>

<a href="<c:url value="/spittles" />">Spittles</a>
<a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>
