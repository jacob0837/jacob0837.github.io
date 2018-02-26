package AutoWireBean;

import java.util.Date;

public class HelloBean {
	
	//员工姓名
	private String staffName;
	
	//员工入职时间
	private Date staffTime;

	public HelloBean(){}
	
	public String getStaffName() {return staffName;}
	public void setStaffName(String staffName) {this.staffName = staffName;}

	public Date getStaffTime() {	return staffTime;}
	public void setStaffTime(Date staffTime) {this.staffTime = staffTime;}
	
	

}
