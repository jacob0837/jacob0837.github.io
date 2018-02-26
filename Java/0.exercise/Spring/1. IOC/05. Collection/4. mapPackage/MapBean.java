package mapPackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapBean {
	private Map<String,Book> books;

	public Map<String, Book> getBooks() {return books;	}
	public void setBooks(Map<String, Book> books) {	this.books = books;	}


	//业务方法：显示所有书籍信息
	public void show(){
		  Set set = books.entrySet();
		  Iterator it = set.iterator();
			while(it.hasNext()){
				Object o = it.next();
				Map.Entry me = (Map.Entry)o;
				System.out.println(me.getKey()+":"+me.getValue());
			}
	}

}
