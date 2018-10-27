<%--
  Created by IntelliJ IDEA.
  User: yuyim
  Date: 2018/10/20
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Recent Psittles</title>
</head>
<body>
<c:forEach items="${spittlesList}" var="spittle" >
    <li id="spittle_<c:out value="spittle.id"/>">
        <div class="spittleMessage">
            <c:out value="${spittle.message}" />
        </div>
        <div>
            <span class="spittleTime"><c:out value="${spittle.time}" /></span>
            <span class="spittleLocation">
                (<c:out value="${spittle.latitude}" />
                <c:out value="${spittle.longtitude}" />)
            </span>
        </div>
    </li>
</c:forEach>
</body>
</html>
