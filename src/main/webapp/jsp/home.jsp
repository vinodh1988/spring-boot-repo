<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Spring boot MVC works</h1>
  <h3><u>Programmers</u></h3>
  <ul>
  <%
  String[] names=(String[])request.getAttribute("names");
  for(String x:names){
  %>
  <li><%=x %></li>
  <%} %>
  </ul>
  
  <h3>Session Scope Data <%= request.getAttribute("sdata") %></h3>
  <h3>Application Scope Data <%= request.getAttribute("adata") %></h3>
</body>
</html>