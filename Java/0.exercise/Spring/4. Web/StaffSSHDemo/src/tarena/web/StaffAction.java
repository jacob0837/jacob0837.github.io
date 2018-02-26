package tarena.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import tarena.persistence.IStaffDao;
import tarena.persistence.Staff;

public class StaffAction extends DispatchAction {

	// ����IStaffDao
	private IStaffDao staffDao;
	

	// �ṩע��staffDaoʵ�����set**()����
	public void setStaffDao(IStaffDao staffDao) {
		this.staffDao = staffDao;
		System.out.println("ע��staffDao");
	}
	
	
	//��ѯ����Ա��
	public ActionForward findAllStaff(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		System.out.println("����StaffAction::findAllStaff");

		//��ѯ����Ա��
		List<Staff> staffList = staffDao.findAllStaff();
		
		//������Ա������Ϣ����HttpSession��Χ������
		request.getSession().setAttribute("STAFFLIST", staffList);
		
		//�ض���staff.jsp��ʾ
		return	mapping.findForward("toStaff");
	}
	
	
	//ע����Ա��
	public ActionForward insert(
			ActionMapping mapping, 
			ActionForm form,
			HttpServletRequest request, 
			HttpServletResponse response) {
		
		System.out.println("����StaffAction::insert");
		
		//��formǿת��StaffForm
		StaffForm staffForm = (StaffForm)form;
		
		//��form��ȡ���û����������
		String name = staffForm.getName();
		String gender = staffForm.getGender();
		
		//����һ��Staffʵ��
		Staff staff = new Staff();
		staff.setName(name);
		staff.setGender(gender);
		
		//���ó־ò㷽��
		staffDao.insert(staff);
		
		//�ض���successҳ��
		return mapping.findForward("toSuccess");
	}	
	
	

}



