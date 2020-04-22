<%@page import="com.practice1.model.UserData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
  UserData userdata=null;
  String str=null;
  HttpSession session2=request.getSession(false);
  Object obj=session2.getAttribute("msg");
  if(obj instanceof UserData)
  {
	  userdata=(UserData)obj;
	  
	  %>
	  
	  <p>Welcome <%=userdata.getFirstname()%></p>
  <% } %>

</body>
</html>