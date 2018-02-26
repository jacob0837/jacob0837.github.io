package JdbcTemplate;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements IUserDao {
	
	// 关联的属性
	private  JdbcTemplate jt;

	//注入的方法
	public void setDataSource(DataSource dataSource) {
   jt = new JdbcTemplate(dataSource);
		if(jt!=null){ System.out.println("JdbcTemplate模版创建成功");}
	}

	
	@Override
	public void delete(User user) {
		System.out.println("delete User...");
	}

	@Override
	public void find(int id) {
		System.out.println("find id...");
		String sql = "SELECT * FROM staff WHERE id=?";
   Object[] args = { id };
   List<User> users = jt.queryForList(sql, args);
        // 返回值为一个java.util.LinkedHashMap类
   Iterator it = users.iterator();
   System.out.println("id\tname\tfender");
   while (it.hasNext()) {
      Map userMap = (Map) it.next();
      System.out.print(userMap.get("id") + "\t");
      System.out.print(userMap.get("name") + "\t");
      System.out.println(userMap.get("gender"));
	}
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
