package tarena.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StaffDaoImplTarget implements IStaffDao {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/test";
	private String user = "root";
	private String password = "root";

	private Connection conn;
	private PreparedStatement pstmt;

	public boolean insert(Staff staff) {
		//可以将以下放入前通知中
		conn = JdbcTemplate.getConnection(driver, url, user, password);
		String sql = "INSERT INTO staff(name,gender) VALUES(?,?)";
		boolean flag = false;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,staff.getName());
			pstmt.setString(2,staff.getGender());
			int i = pstmt.executeUpdate();
			if(i>0){
				System.out.println("注册成功");
				flag = true;
			}else{
				System.out.println("注册失败");
				flag = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//可以将以下放入后通知中
			JdbcTemplate.close(pstmt);
			JdbcTemplate.close(conn);
		}
		return flag;
	}
}
