package connect.JDBC;

import javax.persistence.*;


public class Book
{
	//	Book {ISBN (PK), Title, AuthorID (FK), Publisher, PublishDate, Price}
	// 消息类的标识属性

	private String ISBN;
	private String Title;
	private int AuthorID;
	private String Publisher;
	private String PublishDate;//2011-10-30
	private float Price;
	
	// id的setter和getter方法
	
	public void setISBN(String ISBN)
	{
		this.ISBN =ISBN;
	}
	public String getISBN()
	{
		return this.ISBN;
	}
	public void setTitle(String Title)
	{
		this.Title = Title;
	}
	public String getTitle()
	{
		return this.Title;
	}
	public void setAuthorID(int AuthorID)
	{
		this.AuthorID = AuthorID;
	}
	public int getAuthorID()
	{
		return this.AuthorID;
	}
	public void setPublisher(String Publisher)
	{
		this.Publisher = Publisher;
	}
	public String getPublisher()
	{
		return this.Publisher;
	}
	public void setPublishDate(String PublishDate)
	{
		this.PublishDate = PublishDate;
	}
	public String getPublishDate()
	{
		return this.PublishDate;
	}
	public void setPrice(float Price)
	{
		this.Price = Price;
	}
	public float getPrice()
	{
		return this.Price;
	}
}