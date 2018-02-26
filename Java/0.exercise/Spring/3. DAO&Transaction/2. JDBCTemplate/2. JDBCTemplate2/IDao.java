package JDBCTemplate2;

public interface IDao {

	//注册员工
	public void insert();
	
	//查询所有员工的信息
	public void findAllStaff();
	
	//根据ID号查询某个员工
	public void findStaffById(int id); 
	
	//根据NAME删除某个员工
	public void deleteStaffByName(String name);
}








