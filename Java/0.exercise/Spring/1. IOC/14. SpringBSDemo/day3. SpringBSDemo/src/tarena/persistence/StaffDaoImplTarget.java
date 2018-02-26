package tarena.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tarena.web.DBBean;

public class StaffDaoImplTarget implements IStaffDao {

	private static Connection conn;
	
	static {
		// ��ȡspring-config.xml�ļ�

		ApplicationContext context = 
			new ClassPathXmlApplicationContext(
				"tarena/web/spring-config.xml");

		DBBean db = (DBBean) context.getBean("db");

		String driver = db.getDriver();
		String url = db.getUrl();
		String user = db.getUser();
		String password = db.getPassword();

		conn = JdbcTemplate.getConnection(driver, url, user, password);

	}

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/test";
	private String user = "root";
	private String password = "root";

	private PreparedStatement pstmt;

	public boolean insert(Staff staff) {
		// ���Խ����·���ǰ֪ͨ��
		conn = JdbcTemplate.getConnection(driver, url, user, password);
		String sql = "INSERT INTO staff(name,gender) VALUES(?,?)";
		boolean flag = false;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, staff.getName());
			pstmt.setString(2, staff.getGender());
			int i = pstmt.executeUpdate();
			if (i > 0) {
				System.out.println("ע��ɹ�");
				flag = true;
			} else {
				System.out.println("ע��ʧ��");
				flag = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ���Խ����·����֪ͨ��
			JdbcTemplate.close(pstmt);
			JdbcTemplate.close(conn);
		}
		return flag;
	}
}
