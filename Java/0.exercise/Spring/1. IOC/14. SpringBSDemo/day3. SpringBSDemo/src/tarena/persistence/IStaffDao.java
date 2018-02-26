package tarena.persistence;

public interface IStaffDao {
	//员工注册
	//true:成功
	//false:失败
	public boolean insert(Staff staff);
}
