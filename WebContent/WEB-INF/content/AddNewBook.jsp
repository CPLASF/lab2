<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="loginPage"/></title>
<style type="text/css">
body{      
 
        background-image: url(../../Picture/AddNew.jpg);
		background-size: cover; 
     }
     </style>
     
</head>
<body>
<div style="left: 10%;position: absolute; top: 10%;">
<h1 style="text-align:center">Input Book's Information</h1>
<s:form action="addbook" style="text-align:center">
	<s:textfield label="ISBN" name="ISBN" />
	<s:textfield label="Title" name="Title" />
	<s:textfield label="AuthorID" name="AuthorID" />
	<s:textfield label="Publisher" name="Publisher" />
	<s:textfield label="PublishDate" name="PublishDate" />
	<s:textfield label="Price" name="Price" />
	<s:submit value="确认添加"></s:submit>
	<p>Remark:the date format is "yyyy-mm-dd",for example 2011-1-8</p>
	<% /*ISBN：
	 <input type="text" name="ISBN"></input><br>
	 Title：
	 <input type="text" name="Title"></input><br>
	 AuthorID：
	 <input type="text" name="AuthorID"></input><br>
	 Publisher：
	 <input type="text" name="Publisher"></input><br>
	 PublishDate：
	 <input type="text" name="PublishDate"></input><br>
	 Price：
	 <input type="text" name="Price"></input><br>
	<button>确认添加</button>*/%>
	</s:form>
	</div>
</body>
</html>