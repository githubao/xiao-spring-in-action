<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
    <title>Hello</title>
    <%--<link rel="stylesheet" type="text/css" href="<c:url value="resources/style.css"/>">--%>
</head>

<body>
<h1>Users</h1>

<c:forEach items="${userList}" var="user">
    <li id="user_<c:out value="${user.id}"/>">
        <div class="userName">
            <c:out value="${user.name}"/>
        </div>
        <div class="userAge">
            <c:out value="${user.age}"/>
        </div>
    </li>
</c:forEach>

</body>

</html>

