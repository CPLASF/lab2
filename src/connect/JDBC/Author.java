package connect.JDBC;

import javax.persistence.*;


public class Author
{
	//	Author {AuthorID (PK), Name, Age, Country}
	// 消息类的标识属性
	

	private int AuthorID;
	private int Age;
	private String Name;
	private String Country;

	
	// id的setter和getter方法

	public int getAuthorID()
	{
		return this.AuthorID;
	}
	public void setAuthorID(int AuthorID)
	{
		this.AuthorID = AuthorID;
	}
	
	
	public String getName()
	{
		return this.Name;
	}
	public void setName(String Name)
	{
		this.Name =Name;
	}
	

	public int getAge()
	{
		return this.Age;
	}
	public void setAge(int Age)
	{
		this.Age = Age;
	}
	
	
	public String getCountry()
	{
		return this.Country;
	}
	public void setCountry(String Country)
	{
		this.Country = Country;
	}
	
}