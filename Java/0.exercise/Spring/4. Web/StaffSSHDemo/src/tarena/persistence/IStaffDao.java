package tarena.persistence;

import java.util.List;


//持久层接口
public interface IStaffDao {
	
	//查询所有员工的信息
	public List<Staff> findAllStaff();
	
	//注册新员人
	public void insert(Staff staff);
	
}









