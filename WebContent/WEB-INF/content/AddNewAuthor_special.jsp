<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body{      
 
        background-image: url(../../Picture/AddNew.jpg);
		background-size: cover; 
     }
     </style>
     
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="loginPage"/></title>
</head>
<body>
<div style="left: 10%;position: absolute; top: 10%;">
<h1 style="text-align:center">Input Author's Information</h1>
<% int AuthorID = (int)request.getAttribute("authorid"); %>
<p>AuthorID：<% out.print(AuthorID); %><p>
<s:form action="addauthor" style="text-align:center">
	 <input type=hidden  name="AuthorID" value=<%=AuthorID %>> <br>
	 <s:textfield label="Name" name="Name" />
	 <s:textfield label="Age" name="Age" />
	 <s:textfield label="Country" name="Country" />
	 <s:submit value="确认添加"></s:submit>
	 <% 
	 /*
	 Name：
	 <input type="text" name="Name"></input><br>
	 Age：
	 <input type="text" name="Age"></input><br>
	 Country：
	 <input type="text" name="Country"></input><br>
	<button>确认添加</button>*/
	%>
	</s:form>
	</div>
</body>
</html>
