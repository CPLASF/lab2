package action;

import java.util.ArrayList;
import java.util.List;

import connect.JDBC.Book;
import connect.JDBC.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import connect.JDBC.MysqlJdbc;


public class ShowBookDetailAction extends ActionSupport {

	private String ISBN;
	private int AuthorID;
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getISBN() {
		return this.ISBN;
	}
	
	public void setAuthorID(int AuthorID) {
		this.AuthorID = AuthorID;
	}

	public int getAuthorID() {
		return this.AuthorID;
	}

	
	// 定义处理用户请求的execute方法
	public String execute() {
		try {
			System.out.println(ISBN +"  8908908090  " +AuthorID);
			ActionContext.getContext().put("book detail", new MysqlJdbc().findBDetail(ISBN));
			ActionContext.getContext().put("author detail", new MysqlJdbc().findADetail(AuthorID));
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}

	}
}
