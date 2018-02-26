package DataSource;

import java.sql.SQLException;
import javax.sql.DataSource;

public class UserDaoImpl implements IUserDao {
	
	// 关联的属性
	private DataSource dataSource;

	//注入的方法
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		if(this.dataSource!=null){
       try { if(this.dataSource.getConnection() != null) {
             System.out.println("与数据库成功连接"); }
       } catch (SQLException e) { 
    	    System.out.println("连接失败");e.printStackTrace(); }
		}
	}

	
	@Override
	public void delete(User user) {
		System.out.println("delete User...");
	}

	@Override
	public void find(int id) {
		System.out.println("find id...");
	}

	@Override
	public void insert(User user) {
		System.out.println("insert User...");
	}

	@Override
	public void update(User user) {
		System.out.println("update User...");
	}

}
