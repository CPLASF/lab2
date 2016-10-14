<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css"> 
body{      
 
        background-image: url(../../Picture/error.jpg);
		background-size: cover; 
     }
     
</style> 

<head>
	<title><s:text name="errorPage"/></title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div style="left: 20%; position: absolute; top: 30%;">
	Here is an error.Maybe you have enter the invalid date format or other mistakes.<br>
	<table>
<% String return_url = "http://1.bookdbapp.applinzi.com/returntomainmenu";%>
<a href="<%=return_url %>">Return to main menu</a><br>
</table>
</div>
</body>
</html>