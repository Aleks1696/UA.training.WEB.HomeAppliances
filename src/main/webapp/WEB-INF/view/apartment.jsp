<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.model.entity.Device" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<fmt:setLocale value="ua"/>--%>
<fmt:setLocale value="en"/>
<fmt:setBundle basename="messages"/>

<html>
    <head>
        <title><fmt:message key="jsp.title"/></title>
    </head>
    <body>
        <%
            List<Device> deviceList = null;
            if (request.getSession().getAttribute("devices") != null) {
                deviceList = (List<Device>) request.getSession().getAttribute("devices");
            }
        %>
        <fieldset>
            <legend><fmt:message key="apartment.jsp.devices.legend"/> </legend>

            <% if (deviceList != null) {
                for (Device device : deviceList) { %>
                <p> <%= device.getClass().getSimpleName()%> </p>
                <br>
             <% }
            } %>

            <form action="plugIn">
                <input type="submit" value="<fmt:message key="apartment.jsp.plugIn.button"/>"/>
            </form>
            <form action="plugOff">
                <input type="submit" value="<fmt:message key="apartment.jsp.plugOff.button"/>"/>
            </form>
            <form action="getPowerUsage">
                <input type="submit" value="<fmt:message key="apartment.jsp.getPowerUsage.button"/>"/>
            </form>
            <form action="sortByPowerUsage">
                <input type="submit" value="<fmt:message key="apartment.jsp.sort.button"/>"/>
            </form>
            <form action="findDevice">
                <input type="number" name="minPowerUsage" required="required"/>
                <input type="number" name="maxPowerUsage" required="required"/>
                <input type="submit" value="<fmt:message key="apartment.jsp.findDevice.button"/>"/>
            </form>
        </fieldset>

        <fieldset>
            <legend><fmt:message key="apartment.jsp.dashboard.label"/></legend>
            <c:set var="response" scope="request" value="${requestScope.response}"/>
            <c:if test="${response != null}">
                <c:out value="${response}"/>
            </c:if>
        </fieldset>
    </body>
</html>
