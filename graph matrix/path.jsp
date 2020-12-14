<%@ include file = "header.jsp" %>
<%

int v = (int)session.getAttribute("v");

%>
<h2>Number of vertices = <%= v %></h2>
    <br><br>
<form action="findpath.jsp" method="post">
	<h3>Enter nodes to check whether there a path exist between them or not</h3>
	Source  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="number" name="node1" min="0" max="<%= v-1 %>" value="0" />
    <br>
	Destination : <input type="number" name="node2" min="0" max="<%= v-1 %>" value="0"/>
    <br><br><br>
	<button>Check</button>
</form>