package connect.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import connect.JDBC.Author;
import connect.JDBC.Book;

public class MysqlJdbc {

	public List<Author> selectAuthors(){
		List<Author> aNew = new ArrayList<Author>();
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			// "jdbc:mysql://localhost:3306/bookdb","root","123456";
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
		       // 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM `author`");// user
																	// 为你表的名称
			while (rs.next()) {
				Author a = new Author();
				a.setAuthorID(Integer.parseInt(rs.getString("AuthorID")));
				a.setAge(Integer.parseInt(rs.getString("Age")));
				a.setCountry(rs.getString("Country"));
				a.setName(rs.getString("Name"));
				aNew.add(a);
			}
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		
		
		return aNew;
	}
		
	public List<Book> selectBooks(){
		List<Book> aNew = new ArrayList<Book>();
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM `book` ");// user
																	// 为你表的名称
			while (rs.next()) {
				Book a = new Book();
				a.setAuthorID(Integer.parseInt(rs.getString("AuthorID")));
				a.setISBN(rs.getString("ISBN"));
				a.setPrice(Float.parseFloat(rs.getString("Price")));
				a.setPublishDate(rs.getString("PublishDate"));
				a.setPublisher(rs.getString("Publisher"));
				a.setTitle(rs.getString("Title"));
				aNew.add(a);
			}
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		
		
		return aNew;
	}

	public void updatePrice(float Price,String ISBN){
	
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement state = connect.createStatement();
			state.execute("update book set Price = "+Price +" where ISBN ='"+ISBN+"'");
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		
	}

	public void updatePublishDate(String PublishDate,String ISBN){
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement state = connect.createStatement();
			state.execute("update book set PublishDate = '"+PublishDate +"' where ISBN ='"+ISBN+"'");
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		
	}
	
	public void updatePublisher(String Publisher,String ISBN){
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement state = connect.createStatement();
			String hql = "update book set Publisher = '"+Publisher +"' where ISBN ='"+ISBN+"'";
			System.out.println(hql);
		state.execute(hql);

		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		
	}
	
	public void updateAuthorId(int AuthorID,String ISBN){
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement state = connect.createStatement();
			state.execute("update book set AuthorID = "+AuthorID +" where ISBN ='"+ISBN+"'");
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}
	
	public void insertAuthor(int AuthorID,int Age,String Name,String Country){
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement state = connect.createStatement();
			//String hql =" INSERT INTO `bookdb`.`author` (`AuthorID`, `Age`, `Name`, `Country`) VALUES ('"+
					//	AuthorID+"', '"+Age+"', '"+Name+"', '"+Country+"')";
			String hql = "INSERT INTO author VALUES("+AuthorID+", "+Age+",'"+ Name+"','"+Country+"')";
			//"INSERT INTO author VALUES("+AuthorID+", "+Age+",'"+ Name+"','"+Country+"')"
			state.execute(hql);
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}
	
	public void insertBook(String ISBN,String Title,int AuthorID,String Publisher,String PublishDate,float Price){
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement state = connect.createStatement();
			
			String hql = "INSERT INTO book VALUES('"+ISBN+"','"+Title+"',"+AuthorID+
					",'"+Publisher+"','"+PublishDate+"',"+Price+")";
			//String hql = "INSERT INTO `bookdb`.`book` (`ISBN`, `Title`, `AuthorID`, `Publisher`, `PublishDate`, `Price`) VALUES ('"+
				//	ISBN+"', '"+Title+"', '"+AuthorID+"', '"+Publisher+"', '"+PublishDate
				//	+"', '"+Price+"')";
			state.execute(hql);
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}
	
	public boolean isHaveAuthor(int AuthorID){
		boolean flag = false;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement state = connect.createStatement();

			ResultSet rs = state.executeQuery("select * from author where AuthorID ="+AuthorID);
			if(rs.next()){
				flag = true;
			}else{
				flag = false;
			}
			
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return flag;
	}
	public List<Book> findBooksByAName(String Name){
		List<Book> aNew = new ArrayList<Book>();
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from author a join book b where a.AuthorID = b.AuthorID and a.Name ='"+Name+"'");// user
																	// 为你表的名称
			while (rs.next()) {
				System.out.println("1321548648978941321654878796");
				Book a = new Book();
				a.setAuthorID(Integer.parseInt(rs.getString("AuthorID")));
				a.setISBN(rs.getString("ISBN"));
				a.setPrice(Float.parseFloat(rs.getString("Price")));
				a.setPublishDate(rs.getString("PublishDate"));
				a.setPublisher(rs.getString("Publisher"));
				a.setTitle(rs.getString("Title"));
				aNew.add(a);
			}
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		
		
		return aNew;
	}
	
	public void Delete(String ISBN){
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			  // 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement state = connect.createStatement();
			
			state.execute("delete from book where ISBN = '"+ISBN+"'");
			//DELETE FROM `bookdb`.`book` WHERE `book`.`ISBN` = '1';
			//state.execute("DELETE FROM `bookdb`.`book` WHERE `book`.`ISBN` = '"+ISBN+"'");
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	
		
	}
	
	public Book findBDetail(String ISBN){
		Book a = new Book();
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			  // 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book where ISBN ="+ISBN);// user
																	// 为你表的名称
			while (rs.next()) {
				a.setAuthorID(Integer.parseInt(rs.getString("AuthorID")));
				a.setISBN(rs.getString("ISBN"));
				a.setPrice(Float.parseFloat(rs.getString("Price")));
				a.setPublishDate(rs.getString("PublishDate"));
				a.setPublisher(rs.getString("Publisher"));
				a.setTitle(rs.getString("Title"));
				System.out.println(rs.getString("AuthorID")+"   "+rs.getString("ISBN"));
			}
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return a;
	}
	
	public Author findADetail(int AuthorID){
		Author a = new Author();
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( 
					 "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdbapp",
					 "2l51xjw43o","hk3zh44m5zkhmzw05y3z0zk2ly1lxkmilk0yzi1j");
			  // 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from author where AuthorID ="+AuthorID);// user
																	// 为你表的名称
			while (rs.next()) {
				a.setAuthorID(Integer.parseInt(rs.getString("AuthorID")));
				a.setAge(Integer.parseInt(rs.getString("Age")));
				a.setCountry(rs.getString("Country"));
				a.setName(rs.getString("Name"));
			}
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return a;
	}
	
	
}