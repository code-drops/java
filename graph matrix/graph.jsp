<%@ page import="java.util.*"%>
<html>
<body>
<%
v = (int)session.getAttribute("v");
try {
	int src = (int)session.getAttribute("n1");
	int dest = (int)session.getAttribute("n2");
	int[][] a = (int[][]) session.getAttribute("a");
	
	// creating object of list to represent graph
	ArrayList<ArrayList<Integer>> adj;
	
	
	// true if list is already created
	if(session.getAttribute("list")=="true"){
		adj = (ArrayList<ArrayList<Integer>>)session.getAttribute("adj_list");
	}
	else{
		adj = new ArrayList<ArrayList<Integer>>(v);
		for (int i = 0; i < v; i++){
			adj.add(new ArrayList<Integer>());
		}
	}
	
	// only adds new node if it is not present in list
	if(!adj.get(src).contains(dest)){
		adj.get(src).add(dest);
	}
	
	//  printing the adjacency list
	for (int i = 0; i < adj.size(); i++) { 
        out.print("\nVertex " + i + ":");
		for (int j = 0; j < adj.get(i).size(); j++) {
			out.print(" -> " + adj.get(i).get(j));
		}
		out.print("<br>");
    }
	
	session.setAttribute("adj_list", adj);
	session.setAttribute("list","true");
} catch (Exception e) {
	for (int i = 0; i < v; i++) { 
        out.print("\nVertex " + i + ":");
		out.print("<br>");
    }
}

%>
<form action="path.jsp" method="post">
    <button>Find Path</button>
</form>
</body>
</html>