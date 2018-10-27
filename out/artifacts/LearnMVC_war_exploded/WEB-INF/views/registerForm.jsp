<%--
  Created by IntelliJ IDEA.
  User: yuyim
  Date: 2018/10/21
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
<h1>Register</h1>

<sf:form method="post" commandName="spitter">
    First name: <sf:input path="firstName" /><br/>
    Last name: <sf:input path="lastName" /><br/>
    Email: <sf:input path="email" /><br/>
    Username: <sf:input path="username" /><br/>
    Password: <sf:password path="password" /><br/>

    <input type="submit" value="Register" />
</sf:form>
</body>
</html>
