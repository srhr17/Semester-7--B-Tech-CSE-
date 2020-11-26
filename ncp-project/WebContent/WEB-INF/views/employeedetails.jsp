<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@page import="ncpproject.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Query Status</title>	
<style type="text/css"> 
* {
  margin: 0;
  padding: 0;
  font-family: consolas;
  user-select: none;
}
body {
  justify-content: center;
  align-items: center;

  background: linear-gradient(270deg, #000000, #e7e7e7, #348f9b);
  background-size: 600% 600%;

  animation: changeBackground 30s ease infinite;
  /*   animation-duration,animation-timing-function-cubic bezier,animation-iteration-count */
}
h1{
  justify-content: center;
  align-items: center;
  margin-left: 40%;
  margin-top: 25%;
}

@import url("https://fonts.googleapis.com/css?family=Raleway:400,400i,700");

ul {
  display: flex;
  flex-direction: column;
  align-items: start;
  list-style-type: none;

  height: 100vh;
  justify-content: center;
  align-items: center;
  text-align: center;
  background: #1A1E23;
}

li {
  padding: 6px 0;
}
a {
  --fill-color: #198CE6;
  position: relative;
  display: block;
  padding: 4px 0;
  font: 700 3rem Raleway, sans-serif;
  text-decoration: none;
  text-transform: uppercase;

  -webkit-text-stroke: 2px var(--fill-color);
  background: linear-gradient(var(--fill-color) 0 100%) left / 0 no-repeat;
  color: transparent;
  background-clip: text;
  transition: 0.5s linear;
}

</style>
</head>
<body>
 <h1>Task Completed Successfully!</h1>
   <hr>
      <ul>
      <li><a href="/ncp-project/dashboard">Dashboard</a></li>
      <li><a href="/ncp-project/edit">Profile Edit</a></li>
      <li><a href="/ncp-project/register">Add/Promote Employee</a></li>
      <li><a href="/ncp-project/adminMessage">Admin Messages</a></li>
      <li><a href="/ncp-project/remove">Remove Employee</a></li>
      <li><a href="/ncp-project/display">Display Profile</a></li>
    </ul>
</body>
</html>