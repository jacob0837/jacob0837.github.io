package mapPackage;

public class Book {
	private String bookName;//书名
	private String author;//作者
	private String publisher;//出版社
	
	public Book(){}
	
	public String getAuthor() {return author;}
	public void setAuthor(String author) {this.author = author;}
	
	public String getBookName() {return bookName;}
	public void setBookName(String bookName) {this.bookName = bookName;}
	
	public String getPublisher() {	return publisher;}
	public void setPublisher(String publisher) {this.publisher = publisher;}

	@Override
	public String toString() {
		return "书名："+bookName+"\r\n作者："+ author+"\r\n出版社："+publisher+"\r\n=============";
	}



}
