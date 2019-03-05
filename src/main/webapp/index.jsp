<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<fmt:setLocale value="ua"/>--%>
<fmt:setLocale value="en"/>
<fmt:setBundle basename="messages"/>

<html>
<head>
    <title><fmt:message key="jsp.title"/></title>
</head>
<body>
    <form>
        <fieldset>
            <legend><fmt:message key="index.jsp.createApartment.label"/> </legend>
            <input type="button" value="<fmt:message key="index.jsp.createApartment.button"/>"
                onclick="location.href='http://localhost:8080/HomeAppliances_war_exploded/createApartment'" />
        </fieldset>
    </form>
</body>
</html>
