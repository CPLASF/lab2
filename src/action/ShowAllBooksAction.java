package action;

import java.util.ArrayList;
import java.util.List;

import connect.JDBC.Book;
import connect.JDBC.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import connect.JDBC.MysqlJdbc;


public class ShowAllBooksAction extends ActionSupport {

	// 定义处理用户请求的execute方法
	public String execute() {
		try {
			ActionContext.getContext().put("booksinformation", new MysqlJdbc().selectBooks());
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}

	}
}
