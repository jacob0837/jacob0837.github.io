package tarena.persistence;

public class Staff {

	private int id;// 员工编号
	private String name;// 员工姓名
	private String gender;// 员工性别

	public Staff() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
