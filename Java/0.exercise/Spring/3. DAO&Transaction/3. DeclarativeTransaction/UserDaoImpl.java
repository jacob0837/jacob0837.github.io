package DeclarativeTransaction;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional(readOnly = true)
	public void find(int id) {  //打印所有
		System.out.println("遍历...");
		String sql = "SELECT * FROM staff";
    List<User> users = jt.queryForList(sql);
    Iterator it = users.iterator();
    System.out.println("id\t name\t fender");//打印列表头
    while (it.hasNext()) {
      Map userMap = (Map) it.next();
      System.out.print(userMap.get("id") + "\t ");
      System.out.print(userMap.get("name") + "\t ");
      System.out.println(userMap.get("gender"));
	 }
	}

/******单个查找********
	public void find(int id) {  
		System.out.println("find id ...");
		Object[] args = { id };
		String sql = "SELECT * FROM staff WHERE id=?";
   List<User> users = jt.queryForList(sql,args);
   Iterator it = users.iterator();
   while (it.hasNext()) {
      Map userMap = (Map) it.next();
      System.out.print(userMap.get("id") + "\t ");
      System.out.print(userMap.get("name") + "\t ");
      System.out.println(userMap.get("gender"));
	}
}********************/


	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public void insert(User user) {
		System.out.println("insert User...");
		String sql = "INSERT INTO staff(name,gender) VALUES(?,?)";
		Object[] args = { user.getUserName(), user.getUserGender()};
		int i = jt.update(sql, args);
		   if (i > 0) { System.out.println("插入成功");
                       //抛出异常，事务回滚
        //Integer.parseInt("abc123");//这语句出错，看能否回滚。如果回滚不生效与数据库支持有关
        }
	}

	@Override
	public void update(User user) {
		System.out.println("update User...");
	}

}
