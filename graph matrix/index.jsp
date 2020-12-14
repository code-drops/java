<%@ include file = "header.jsp" %>
<html> 
<head>
    <style>
        button {
          width: 25%;
        }
    </style>
</head>
<body>

<form action="edges.jsp" method="post">
    <br><br><br><br><br><br><br>
    <h2>Enter number of vertices : </h2><input type="number" id="vertices" name="vertices" min="1" max="10" value="1"/>
    <br>
	<button>Submit</button>
</form>
<%
	// for edges.jsp page
	session.setAttribute("index","true");
%>
</body>