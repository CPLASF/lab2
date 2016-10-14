package action;

import java.util.ArrayList;
import java.util.List;

import connect.JDBC.Book;
import connect.JDBC.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import connect.JDBC.MysqlJdbc;

public class ShowBooksByAuthorAction extends ActionSupport {

	private String Name;
	
	public void setName(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return this.Name;
	}

	
	// ���崦���û������execute����
	public String execute() {
		try {
			ActionContext.getContext().put("books from author", new MysqlJdbc().findBooksByAName(Name));
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}

	}
}
