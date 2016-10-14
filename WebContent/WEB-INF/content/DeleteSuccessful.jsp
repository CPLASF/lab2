<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<style type="text/css">
body{      
 
        background-image: url(../../Picture/Success.jpg);
		background-size: cover; 
     }

</style> 

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<div style="left: 40%; position: absolute; top: 40%;">
Delete Successfully!<br>
<table>


<% String return_url = "http://1.bookdbapp.applinzi.com/returntomainmenu";%>
<a href="<%=return_url %>">Return to main menu</a><br>
</table>
</div>
</body>

</html>