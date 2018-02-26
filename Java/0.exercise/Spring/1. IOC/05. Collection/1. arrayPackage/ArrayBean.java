package arrayPackage;

public class ArrayBean {
	private String[] books;

	public String[] getBooks() {
		return books;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}
	
	//显示所有书籍信息
	public void show(){
		for(String b:books){
			System.out.println("书："+b);
		}
	}

}
