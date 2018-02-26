package tarena.persistence;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;


public class StaffDaoImpl implements IStaffDao {

	private HibernateTemplate ht;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		if(sessionFactory!=null){
			ht = new HibernateTemplate(sessionFactory);
		}
	}
	
	public List<Staff> findAllStaff() {
		List<Staff> staffList = new ArrayList<Staff>();
		
		String hql="FROM Staff";
		staffList = ht.find(hql);
		
		return staffList;
	}

	public void insert(Staff staff) {
		if(staff!=null){
			ht.save(staff);
		}
	}

}




