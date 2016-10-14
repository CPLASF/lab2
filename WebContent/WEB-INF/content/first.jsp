<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="loginPage"/></title>
<style type="text/css">
table {
	border-collapse: collapse;
	border: none;
	height: 80%;
	width: 80%;
	margin: 10px auto;
}

td {
	border: solid #000 1px;
	margin: 10px auto;
}

#an {
	margin: none;
	padding: none;
	width: 100%;
	height: 100%;
}
 body{      
 
        background-image: url(../../Picture/AddNew.jpg);
		background-size: cover; 
     }
a {
	color: #000000;
	text-decoration: none;
}

a:hover {
	color: #F00;
	text-decoration: underline;
}

a:active {
	color: #30F;
}
</style>

</head>
<body>
<div style="left: 30%; position: absolute; top: 35%;">

<h1 style="text-align:center">BookDB</h1>
<a href="http://1.bookdbapp.applinzi.com/AddNewBook" >AddNewBook </a><br>
<a href="http://1.bookdbapp.applinzi.com/AddNewAuthor" >AddNewAuthor </a><br>
<a href="http://1.bookdbapp.applinzi.com/showallbooks" >ShowAllBooks </a><br>
<a href="http://1.bookdbapp.applinzi.com/InputAuthorSearchBy" >SearchBooksByAuthor</a><br>
<a href="http://1.bookdbapp.applinzi.com/showallbooks" >UpdateBookInformation</a><br>
</div>
</body>
</html>