<%@ include file = "header.jsp" %>
<%@ page import="java.lang.*"%>
<head>
    <style>
        button {
          width: 60%;
        }
    </style>
</head>
<%
int v=0;

// to check that the user came first time on this page
if(session.getAttribute("index")=="true"){
	String n = request.getParameter("vertices");
	v = Integer.valueOf(n);
	session.setAttribute("index","false");
	session.setAttribute("v",v);
}else{
	v = (int)session.getAttribute("v");
}
   out.println("<h2>Number of vertices : " +v+"</h2>");
out.print("<br>");

%>
<form action="next.jsp" method="post">
	<h3>Enter nodes in which there is an edge exist</h3>
	<span>Node1 :</span> <input type="number" name="node1" min="0" max="<%= v-1 %>" value="0"/>
    <span>Node2 :</span> <input type="number" name="node2" min="0" max="<%= v-1 %>" value="0"/>
    <br><br>
	<button>Submit Edge</button>
</form>

<br><br>
<%@ include file = "graph.jsp" %>