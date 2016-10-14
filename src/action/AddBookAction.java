package action;

import java.util.ArrayList;
import java.util.List;

import connect.JDBC.Book;
import connect.JDBC.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import connect.JDBC.MysqlJdbc;

public class AddBookAction extends ActionSupport {
	/// private int ID;
	private String ISBN;
	private String Title;
	private int AuthorID;
	private String Publisher;
	private String PublishDate;
	private float Price;

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public String getTitle() {
		return this.Title;
	}

	public void setAuthorID(int AuthorID) {
		this.AuthorID = AuthorID;
	}

	public int getAuthorID() {
		return this.AuthorID;
	}

	public void setPublisher(String Publisher) {
		this.Publisher = Publisher;
	}

	public String getPublisher() {
		return this.Publisher;
	}

	public void setPublishDate(String PublishDate) {
		this.PublishDate = PublishDate;
	}

	public String getPublishDate() {
		return this.PublishDate;
	}

	public void setPrice(float Price) {
		this.Price = Price;
	}

	public float getPrice() {
		return this.Price;
	}

	// 定义处理用户请求的execute方法
	public String execute() {
		try {
			
			
			String[] a = PublishDate.split("\\-");
			
			int day = Integer.parseInt(a[2]);
			int month = Integer.parseInt(a[1]);
			int year = Integer.parseInt(a[0]);

			new MysqlJdbc().insertBook(ISBN, Title, AuthorID, Publisher, PublishDate, Price);
			ActionContext.getContext().put("books", new MysqlJdbc().selectBooks());
			if (new MysqlJdbc().isHaveAuthor(AuthorID) == false) {
				ActionContext.getContext().put("authorid", AuthorID);
				return INPUT;
			} else {
				return SUCCESS;
			}
		} catch (Exception e) {
			return ERROR;
		}

	}
}
