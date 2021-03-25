<%@ page language="java" contentType="text/html" %>
<html>
<body bgcolor="pink">
<jsp:useBean id="clock" class="java.util.Date"/>
<ul>
<li>Date : <jsp:getProperty name="clock" property="date"/>
<li>Month : <jsp:getProperty name="clock" property="month"/>
<li>Year : <jsp:getProperty name="clock" property="year"/>
<li>hours : <jsp:getProperty name="clock" property="hours"/>
<li>Minutes : <jsp:getProperty name="clock" property="minutes"/>
</ul>
</body>
</html>