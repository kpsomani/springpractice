<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

 .navbarform{
 	position:fixed;
 	width: 100%;
 	height:40px;
 	background-color: #880000;
 	top:0%;
 }
 .formbox
 {
    background-color: #880000;
    width: 550px;
    height: 400px;
    margin-top: 10%;
    margin-left: 27%;
    align-items: center;
    border-radius: 10px;
    position: relative;
 }

 .input1,input[type="password"]
 {
    margin-top: 20px;
    margin-left: 7%;
    width: 200px;
    height: 25px;
    outline: none;
    border:none;
    border-bottom: 2px solid black;
    background: transparent;
    color: white;

 }

 button
 {
    width: 150px;
    height: 35px;
    margin-top: 25%;
    margin-left:70%;
    border-radius: 10px;
    background-color: black;
    color: white;
 }
  input[type="text"],button,input[type="password"]
  {
  	position:relative;
  }

  form
  {
  	display:inline-grid;
  	grid-template-columns: 300px 300px; 
  	grid-template-rows: 70% 30%
  }

</style>
</head>
<body>
<div class="navbarform">
</div>
<div class="formbox">
	<h1 style="text-align: center;">Register</h1>
	<form action="signup">

	 <div>
      <input type="text" name="firstname"  id="input1" placeholder="First Name" class="input1" required><br>
      <input type="text" name="userid" id="input3"  placeholder="User ID"class="input1">
      <input type="Password" name="psw2" id="input5" placeholder="Password" required><br>
      <input type="date" name="birthday" id="input7" class="input1">
     </div>
     <div>
         <input type="text" name="lastname"  id="input2" placeholder="Last Name" class="input1" required><br>
         <input type="text" name="email"  id="input4" placeholder="Email" class="input1" required><br>
         <input type="number" name="age"  id="input6" placeholder="Age" class="input1" required><br>
     </div>
      <button type="submit">Sign Up</button>
    </form>
</div>
</body>
</html>