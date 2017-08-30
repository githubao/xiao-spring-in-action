<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
    <title>Hello</title>
    <%--<link rel="stylesheet" type="text/css" href="<c:url value="resources/style.css"/>" >--%>
</head>

<body>
<h1>Welcome to Hello</h1>

    <a href="<c:url value="users"/>">users</a>
    <a href="<c:url value="register"/>">register</a>

</body>

</html>