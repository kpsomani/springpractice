<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

body
 {
 	background-color: #000000;
 }
 div
 {
 	background-color:#880000;
 	width: 450px;
 	height: 400px;
 	margin-top: 10%;
 	margin-left: 35%;
    align-items: center;
    border-radius: 10px;
 }

 input[type="text"]
 {
    margin-top: 10%;
    margin-left: 28%;
    width: 200px;
    height: 25px;
    border-radius: 10px;
    outline: hidden;
    
 }
  input[type="password"]
 {
    margin-top: 10%;
    margin-left: 28%;
    width: 200px;
    height: 25px;
    border-radius: 10px;
    outline: hidden;
    
 }
 label
 {
 	margin-left: 15%;
    margin-top: 3%;
    position: absolute;
    font-size: larger;
 }

 button
 {
    width: 150px;
    height: 35px;
    margin-top: 30px;
    margin-left: 35%;
    border-radius: 10px;
    background-color: black;
    color: white;
 }


</style>
</head>
<body>

  <%
    HttpSession session=request.getSession(false);
    String msg=null;
    Object obj=null;
    if(session==null)
    {
    	obj=request.getAttribute("msg");
    	if(obj!=null)
    	{
    	   msg=(String)obj;
    	   out.write(msg);
       	%>
       	<h3 style="color: white; margin-left: 40%; margin-top: 20px; position: fixed;"><%=msg%></h3>
       <% }
    	}
  %>
  <div>
	<form action="receive">
	  <label>User ID</label><br>
      <input type="text" name="username" placeholder="User id"><br>
      <label>Password</label><br>
      <input type="Password" name="psw" placeholder="password">
      <br>
      <button type="submit">Log In</button>
    </form>
</div>
</body>
</html>