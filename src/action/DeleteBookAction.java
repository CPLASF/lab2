package action;

import java.util.ArrayList;
import java.util.List;

import connect.JDBC.Book;
import connect.JDBC.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import connect.JDBC.MysqlJdbc;


public class DeleteBookAction extends ActionSupport {
	private String ISBN;
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	// 定义处理用户请求的execute方法
	public String execute() 
	{
		try{		
			new MysqlJdbc().Delete(this.ISBN);
			
			return SUCCESS;
		
		}
		catch(Exception e)
		{
			ActionContext.getContext().put("e",e);
			return ERROR;
		}
	}
}
