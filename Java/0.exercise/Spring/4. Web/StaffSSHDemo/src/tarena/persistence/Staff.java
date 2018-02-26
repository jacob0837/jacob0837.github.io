package tarena.persistence;

/**
 * Staff entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Staff implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String gender;

	// Constructors

	/** default constructor */
	public Staff() {
	}

	/** full constructor */
	public Staff(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}