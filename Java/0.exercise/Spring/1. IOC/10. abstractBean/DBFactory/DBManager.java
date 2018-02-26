package DBFactory;

public abstract class DBManager {
	
	public void display(){
		DBBean dbBean = linkedDB();
		System.out.println(dbBean.toString());
	}
	
	public abstract DBBean linkedDB();

}
