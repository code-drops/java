<%@ include file = "header.jsp" %>
<%
// to clear the session and its variable
session.invalidate();
response.sendRedirect("index.jsp");
%>