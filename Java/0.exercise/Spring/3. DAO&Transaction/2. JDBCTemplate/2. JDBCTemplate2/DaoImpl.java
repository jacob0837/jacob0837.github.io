package JDBCTemplate2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DaoImpl implements IDao {

	//关联JDBCTemplate(Spring提供）
	private JdbcTemplate jt;
	
	//注入DataSource的方法
	public void setDataSource(DataSource dataSource){
		if(dataSource!=null){
			//构造JdbcTemplate
			jt = new JdbcTemplate(dataSource);
		}else{
			System.out.println("注入的DataSource为空");
		}
	}
	
	public void insert() {
		//AOP
		//JdbcTemplate开事务
		String sql="INSERT INTO staff(name,gender) VALUES('tony','m')";
		jt.execute(sql);
		//JdbcTemplate提供事务
	}

	public void findAllStaff() {
		String sql="SELECT * FROM staff";
		List staffList = jt.queryForList(sql);
		Iterator it = staffList.iterator();
		while(it.hasNext()){
			Map staffMap = (Map)it.next();
			System.out.print(staffMap.get("id")+"\t");
			System.out.print(staffMap.get("name")+"\t");
			System.out.println(staffMap.get("gender"));
		}
	}

	public void findStaffById(int id) {
		String sql="SELECT * FROM staff WHERE id = ?";
		List staffList = jt.queryForList(sql, new Object[]{id});
		Iterator it = staffList.iterator();
		while(it.hasNext()){
			Map staffMap = (Map)it.next();
			System.out.print(staffMap.get("id")+"\t");
			System.out.print(staffMap.get("name")+"\t");
			System.out.println(staffMap.get("gender"));
		}
	}

	public void deleteStaffByName(String name) {
		String sql="DELETE FROM staff WHERE name = '"+name+"'";
		System.out.println("SQL->"+sql);
		jt.execute(sql);
	}

}













