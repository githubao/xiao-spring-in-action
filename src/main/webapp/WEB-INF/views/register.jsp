<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
    <title>Hello</title>
    <%--<link rel="stylesheet" type="text/css" href="<c:url value="../resources/style.css"/>">--%>
</head>

<body>
<h1>register</h1>

<form method="post">
    name: <input type="text" name="name"/><<br>
    age: <input type="password" name="age"/><<br>

    <input type="submit" value="register"/>

</form>

</body>

</html>

