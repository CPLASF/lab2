package action;

import java.util.ArrayList;
import java.util.List;

import connect.JDBC.Book;
import connect.JDBC.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import connect.JDBC.MysqlJdbc;

public class ChoseUpdateInformation extends ActionSupport {
	private String check;
	private String ISBN;
	private int AuthorID;
	private String Publisher;
	private String PublishDate;
	private float Price;

	public void setCheck(String check) {
		this.check = check;
	}

	public String getCheck() {
		return check;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getISBN() {
		return ISBN;
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

	public String execute() {
		try {
			String[] s = check.split(", ");
			/// 更新AuthorID、Publisher、PublishDate、Price
			int flag = 0;///判断是否进入input状态的标志
			for (Object ele : s) {
				 if (ele.equals("AuthorID") == true) {
					new MysqlJdbc().updateAuthorId(AuthorID, ISBN);
					if (new MysqlJdbc().isHaveAuthor(AuthorID) == false) {
						ActionContext.getContext().put("authorid", AuthorID);
						flag = 1;}
				}else if (ele.equals("Publisher") == true) {
					new MysqlJdbc().updatePublisher( Publisher,ISBN);
				}else if (ele.equals("PublishDate") == true) {
					new MysqlJdbc().updatePublishDate(PublishDate,ISBN);
					String[] a = PublishDate.split("\\-");
					
					int day = Integer.parseInt(a[2]);
					int month = Integer.parseInt(a[1]);
					int year = Integer.parseInt(a[0]);
				}else if (ele.equals("Price") == true) {
					new MysqlJdbc().updatePrice(Price, ISBN);
				}
			}
			if(flag == 1){
				return INPUT;
			}
		return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}
}


///// 更新Publisher
//for (Object ele : s) {
//	if (ele.equals("Publisher") == true) {
//		new MysqlJdbc().updatePublisher(ISBN, Publisher);
//	}
//
//}
//
///// 更新PublishDate
//for (Object ele : s) {
//	if (ele.equals("PublishDate") == true) {
//		new MysqlJdbc().updatePublishDate(ISBN, PublishDate);
//	}
//
//}
//
///// 更新Price
//for (Object ele : s) {
//	if (ele.equals("Price") == true) {
//		new MysqlJdbc().updatePrice(ISBN, Price);
//
//	}
//
//}

