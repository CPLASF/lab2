package action;

import java.util.ArrayList;
import java.util.List;

import connect.JDBC.Book;
import connect.JDBC.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import connect.JDBC.MysqlJdbc;


public class AddAuthorAction extends ActionSupport{
	
	private String AuthorID;
	private int Age;
	private String Name;
	private String Country;
	
	public void setAuthorID(String AuthorID)
	{
		this.AuthorID =AuthorID;
	}
	public String getAuthorID()
	{
		return this.AuthorID;
	}
	public void setName(String Name)
	{
		this.Name =Name;
	}
	public String getName()
	{
		return this.Name;
	}
	public void setAge(int Age)
	{
		this.Age = Age;
	}
	public int getAge()
	{
		return this.Age;
	}
	public void setCountry(String Country)
	{
		this.Country = Country;
	}
	public String getCountry()
	{
		return this.Country;
	}
	// 定义处理用户请求的execute方法
	public String execute() 
	{
		try{
			int length = AuthorID.length();
			//AuthorID = AuthorID.substring(0, length-1);
			int AID = Integer.parseInt(AuthorID);
			new MysqlJdbc().insertAuthor(AID, Age,Name,  Country);
			///new AuthorManager().saveAuthor(Integer.valueOf(AuthorID),Name,Age,Country);
			System.out.println("424234234444");
			ActionContext.getContext().put("authors" , new MysqlJdbc().selectAuthors());
			return SUCCESS;
		}
		catch(Exception e)
		{
			return ERROR;
		}
		    
	}
}
