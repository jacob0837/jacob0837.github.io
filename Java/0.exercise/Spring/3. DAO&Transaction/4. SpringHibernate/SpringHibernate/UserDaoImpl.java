package SpringHibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoImpl extends HibernateDaoSupport implements IUserDao {
   
	@Transactional(propagation = Propagation.REQUIRED)
  public void delete(User user) {
     System.out.println("正在删除用户。。。");
      }
   
	@Transactional(readOnly = true)
	 public void find(int id) {
     System.out.println("正在查询用户。。。");
     String hql = "FROM User"; //User是类不是表
     List<User> users = this.getHibernateTemplate().find(hql);
     System.out.println("id\tname\tgender");//打印表头
   for(User u : users){ //遍历
     System.out.print(u.getUserId() + "\t");
     System.out.print(u.getUserName() + "\t");
     System.out.println(u.getUserGender());}
          }
	/*  按输入的id单个显示
	 	 public void find(int id) {
     System.out.println("正在查询用户。。。");
     String hql = "FROM User WHERE userId=? "; //User是类不是表
     Object[] args = { id };
     List<User> users = this.getHibernateTemplate().find(hql, args);
     System.out.println("id\tname\tgender");//打印表头
     System.out.print(users.get(0).getUserId() + "\t");
     System.out.print(users.get(0).getUserName() + "\t");
     System.out.println(users.get(0).getUserGender());
          }
	 */
	
	@Transactional(propagation = Propagation.REQUIRED)
	 public void insert(User user) {
     System.out.println("正在增加用户。。。");
     this.getHibernateTemplate().save(user);
              // 产生异常，事务回滚，不会入库
     //Integer.parseInt("abc123"); //必然会回滚 Hibernate的功能
     System.out.println("成功将"+ user.getUserName()+"的信息加入数据库");
    }
	
@Transactional(propagation = Propagation.REQUIRED)
 public void update(User user) {
	System.out.println("正在修改用户。。。");
}

}
