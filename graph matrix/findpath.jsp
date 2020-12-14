<%@ include file = "header.jsp" %>
<%@ page import="java.util.*"%>
<%
int i,j,k;
int v = (int)session.getAttribute("v");
int[][] a = (int[][]) session.getAttribute("a");

String node1 = request.getParameter("node1");
int src = Integer.valueOf(node1);
String node2 = request.getParameter("node2");
int dest = Integer.valueOf(node2);

// if src and destination are same
if(src==dest){
   out.print("<h1>Yes, There's a path</h1>");
}else{
	boolean[][] mat = new boolean[v][v];
	for (i = 0; i < v; i++){
		for (j = 0; j < v; j++){
			if(a[i][j]==1){
				mat[i][j] = true;
			}
		}
	}
	for(k = 0; k < v; k++) 
		{
			for(i = 0; i < v; i++) 
			{
				for(j = 0; j < v; j++)
				{
					mat[i][j] = mat[i][j] || 
								mat[i][k] &&
								mat[k][j];
				}
			}
		}
	if (src >= v || dest >= v)
		{
			out.print("<h1>Sorry , path doesn't exist</h1>");
		}
	else{
	 
		if (mat[src][dest]==true){
			out.print("<h1>Yes, There's a path</h1>");
		}
		else{
			out.print("<h1>Sorry , path doesn't exist</h1>");
		}
	}
}
%>
<form action="path.jsp" method="post">
    <button>Find Another Path</button>
</form>
<form action="clear.jsp" method="post">
    <button>Back to home page</button>
</form>