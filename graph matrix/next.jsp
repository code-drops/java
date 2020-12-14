<%@ include file = "header.jsp" %>
<%

String node1 = request.getParameter("node1");
int n1 = Integer.valueOf(node1);
String node2 = request.getParameter("node2");
int n2 = Integer.valueOf(node2);

int v = (int)session.getAttribute("v");

int [][] a;

// it will be true when the array is already created and edges have been added previously
if(session.getAttribute("array")=="true"){
	a = (int[][]) session.getAttribute("a");
}
else{
	a = new int[v][v];
}

// updating the value to 1 as there is an edge between n1 and n2
a[n1][n2] = 1;


session.setAttribute("a", a);
session.setAttribute("array","true");
session.setAttribute("n1", n1);
session.setAttribute("n2", n2);
response.sendRedirect("edges.jsp");
%>