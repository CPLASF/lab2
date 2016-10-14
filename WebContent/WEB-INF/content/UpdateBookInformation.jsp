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
<h1 style="text-align:center">图书数据</h1>
	<table style="text-align:center">
		<tr> 
			<td>ISBN</td>
	 		<td>Title</td> 
	 		<td>AuthorID</td>
	 		<td>Publisher</td>
	 		<td>PublishDate</td>
	 		<td>Price</td>
	 		<td>Update</td>
	 		<td>Delete</td>
	 </tr>
	 <%
	 List<Book> list =( List<Book>)request.getAttribute("booksinformation");
	 String return_url = "http://1.bookdbapp.applinzi.com/returntomainmenu";
	 for(Object ele : list)
	 {
	 	 Book p = (Book)ele;
	 	 String I_v = p.getISBN();
		int a_v = p.getAuthorID();
		
		String detail_url = "http://1.bookdbapp.applinzi.com/showbookdetail?ISBN='"+I_v+"'&AuthorID="+a_v;%>
	 	 
		 <tr>
		 	<td><%=p.getISBN()%></td>
		 	<td><a href="<%=detail_url %>"><%=p.getTitle()%></a></td>
		 	<td><%=p.getAuthorID()%></td>
		 	<td><%=p.getPublisher()%></td>
		 	<td><%=p.getPublishDate()%></td>
		 	<td><%=p.getPrice()%></td>
		 	
		 <%	
		 /*如：特别的在使用response.sendRedirect做页面转向的时候，也可以用如下代码：

response.sendRedirect("thexuan.jsp?action=transparams&detail=directe") ，可用request.getParameter(name)取得参数
*/			
			String delete_url = "http://1.bookdbapp.applinzi.com/deletebook?ISBN="+I_v;
			String update_url = "http://1.bookdbapp.applinzi.com/ChoseFormsToUpdate?ISBN='"+p.getISBN()+"'";
	 	  %>
		 
		 	<td><a href="<%=update_url %>">Update</a></td>
		 	<td><a href="<%=delete_url %>">Delete</a><br></td>
	

		 	
		 </tr>
		
	 <% } %>
	 <% request.setAttribute("ISBN", "22222222222"); %>
		 	<form > click book title for more information  </form>
	</table>
<a href="<%=return_url %>">Return to main menu</a><br>
</div>
</body>
</html>