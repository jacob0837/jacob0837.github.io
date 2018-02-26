package listPackage;

import java.util.List;

public class ListBean {
	private List<String> books;

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}
	
	//显示所有书籍信息
	public void show(){
		for(String b:books){
			System.out.println("书："+b);
		}
	}

}
