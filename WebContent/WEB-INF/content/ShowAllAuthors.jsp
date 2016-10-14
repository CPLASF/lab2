<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.List"
    pageEncoding="UTF-8"%>
 <%@page import="connect.JDBC.Author" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title><s:text name="succPage"/></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css"> 
table 
{ 
border-collapse: collapse; 
border: none;
height: 80%;
width: 80%;       
margin: 10px auto; 
} 
td 
{ 
border: solid #000 1px;
margin: 10px auto; 
} 
#an
{
margin:none;
padding:none;
width:100%;
height:100%;
}
body{      
 
        background-image: url(../../Picture/ShowAllBooks.jpg);
		background-size: cover; 
     }
</style> 
</head>
<body>
<h1 style="text-align:center">作者数据</h1>
	<table style="text-align:center">
		<tr> 
	 		<td>AuthorID</td>
	 		<td>Name</td>
	 		<td>Age</td>
	 		<td>Country</td>
	 </tr>
	 <%
	 List<Author> list =( List<Author>)request.getAttribute("authors");
	 
	 for(Object ele : list)
	 {
		 Author p = (Author)ele;%>
		 <tr>
		 	<td><%=p.getAuthorID()%></td>
		 	<td><%=p.getName()%></td>
		 	<td><%=p.getAge()%></td>
		 	<td><%=p.getCountry()%></td>
		 	
		 </tr>
	 <% } %>
	 
	</table>
	<%String return_url = "http://1.bookdbapp.applinzi.com/returntomainmenu";%>
<a href="<%=return_url %>">Return to main menu</a><br>
</div>
</body>
</html>