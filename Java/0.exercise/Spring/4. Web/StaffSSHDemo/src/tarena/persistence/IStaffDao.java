package tarena.persistence;

import java.util.List;


//�־ò�ӿ�
public interface IStaffDao {
	
	//��ѯ����Ա������Ϣ
	public List<Staff> findAllStaff();
	
	//ע����Ա��
	public void insert(Staff staff);
	
}









