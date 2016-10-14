<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.List"
    pageEncoding="UTF-8"%>
 <%@page import="connect.JDBC.Book" %>
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
width: 55%;       
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
width:40%;
height:100%;
}
body{      
 
        background-image: url(../../Picture/Update.jpg);
		background-size: cover; 
     }
     
</style> 
</head>
<body>
<h1 style="text-align:center">图书书名</h1>
	<table style="text-align:center">
		<tr> 
	 		<td>Title</td> 
	 		<td>operation</td>
	 		
	 </tr>
	 
	 <%
	 List<Book> list =( List<Book>)request.getAttribute("books from author");
	 for(Object ele : list)
	 {
	 	 Book p = (Book)ele;
	 	 
	 	String I_v = p.getISBN();
		int a_v = p.getAuthorID();
		
		String detail_url = "http://1.bookdbapp.applinzi.com/showbookdetail?ISBN='"+I_v+"'&AuthorID="+a_v;
		String delete_url = "http://1.bookdbapp.applinzi.com/deletebook?ISBN="+I_v;
	 	 
	 	 %>
		 <tr>
		 	<td><a href="<%=detail_url %>"><%=p.getTitle()%></a><br></td>
		 	<td><a href="<%=delete_url %>">Delete</a><br></td>

		 
		 </tr>
		 
	 <% } %>
	 <form > click book title for more information  </form>
	</table>
	<% String return_url = "http://1.bookdbapp.applinzi.com/returntomainmenu"; %>
<a href="<%=return_url %>">Return to main menu</a><br>
</body>
</html>