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
<%String a = request.getParameter("ISBN"); %>

<div style="left: 40%; position: absolute; top: 30%;">
<s:form action="chosetoupdate" namespace="/tag">
	<input type=hidden  name="ISBN" value=<%=a %> /> 
	
	<s:checkbox name="check" label="AuthorID:" fieldValue="AuthorID"/>
	<s:textfield label="NewAuthorID" name="AuthorID" />
	
	<s:checkbox name="check" label="Publisher:" fieldValue="Publisher"/>
	<s:textfield label="NewPublisher" name="Publisher" />
	
	<s:checkbox name="check" label="PublishDate:" fieldValue="PublishDate"/>
	<s:textfield label="NewPublishDate" name="PublishDate" />
	
	<s:checkbox name="check" label="Price:" fieldValue="Price"/>
	 <s:textfield label="NewPrice" name="Price" />
	 check the box which you want to update and file the new information in text below
		<s:submit value="确认修改"></s:submit>
	</s:form>
</div>
<!--<form action="chosetoupdate" style="text-align:center">
AuthorID:
<input type="checkbox" name="check" value="AuthorID" />
New:
<input type="text" name="NewAuthorID"></input>
<br />
Publisher: 
<input type="checkbox" name="check" value="Publisher" />
New:
<input type="text" name="NewPublisher"></input>
<br />
PublishDate: 
<input type="checkbox" name="check" value="PublishDate" />
New:
<input type="text" name="NewPublishDate"></input>
<br />
Price: 
<input type="checkbox" name="check" value="Price" />
New:
<input type="text" name="NewPrice"></input>
<br /><br />
check the box which you want to update
<button>确认修改</button>
</form>   -->




</body>
</html>