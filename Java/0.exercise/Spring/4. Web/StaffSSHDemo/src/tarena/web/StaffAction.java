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

	// 关联IStaffDao
	private IStaffDao staffDao;
	

	// 提供注入staffDao实现类的set**()方法
	public void setStaffDao(IStaffDao staffDao) {
		this.staffDao = staffDao;
		System.out.println("注入staffDao");
	}
	
	
	//查询所有员工
	public ActionForward findAllStaff(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		System.out.println("进入StaffAction::findAllStaff");

		//查询所有员工
		List<Staff> staffList = staffDao.findAllStaff();
		
		//将所有员工的信息绑定在HttpSession范围对象中
		request.getSession().setAttribute("STAFFLIST", staffList);
		
		//重定向到staff.jsp显示
		return	mapping.findForward("toStaff");
	}
	
	
	//注册新员工
	public ActionForward insert(
			ActionMapping mapping, 
			ActionForm form,
			HttpServletRequest request, 
			HttpServletResponse response) {
		
		System.out.println("进入StaffAction::insert");
		
		//将form强转成StaffForm
		StaffForm staffForm = (StaffForm)form;
		
		//从form中取得用户输入的内容
		String name = staffForm.getName();
		String gender = staffForm.getGender();
		
		//构造一个Staff实例
		Staff staff = new Staff();
		staff.setName(name);
		staff.setGender(gender);
		
		//调用持久层方法
		staffDao.insert(staff);
		
		//重定向到success页面
		return mapping.findForward("toSuccess");
	}	
	
	

}



