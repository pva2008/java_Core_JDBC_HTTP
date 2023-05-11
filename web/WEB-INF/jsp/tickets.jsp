<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--<%@ taglib prefix="c" uri=""  %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Купленные билеты:</h1>
<c:if test="${not empty requestScope.tickets}">
<ul><c:forEach var="ticket" items="${requestScope.tickets}">

    <li>${fn:toLowerCase(ticket.seatNo)}</li>

</c:forEach>
    </c:if>

</ul>
</body>
</html>

