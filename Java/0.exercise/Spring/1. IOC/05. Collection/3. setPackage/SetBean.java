package setPackage;

import java.util.Iterator;
import java.util.Set;

public class SetBean {
	private Set<Book> books;

	public Set<Book> getBooks() {return books;}
	public void setBooks(Set<Book> books) {this.books = books;}
	
	// 业务方法
	public void show() {
		Iterator<Book> it = books.iterator();
		while(it.hasNext()){
			Book book = it.next();
			System.out.println("书名->"+book.getBookName());
			System.out.println("作者->"+book.getAuthor());
			System.out.println("出版社->"+book.getPublisher());
			System.out.println("=======");
		}
	}
	
	//课堂作业：三本书
	//		   每本书包括书名，作者，出版社，单价。
	//		10分钟
}
