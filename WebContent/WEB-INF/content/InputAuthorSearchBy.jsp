<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body{      
 
        background-image: url(../../Picture/InputAuthorSearchBy.jpg);
		background-size: cover; 
     }
     </style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="loginPage"/></title>
</head>
<body>
<div style="left: 40%;position: absolute; top: 30%;">
<s:form action="searchbookbyauthor" style="text-align:center">
<p>Input author's name in the box<p>
	Name：
	 <input type="text" name="Name"></input><br>
	<button>确认查找</button>
	</s:form>
	</div>
</body>
</html>