package tarena.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tarena.persistence.JdbcTemplate;
import tarena.persistence.Staff;

public class RegisterServlet extends HttpServlet {

	private Connection conn;

	public void destroy() {
		super.destroy();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String gender = request.getParameter("gender");

		if (name.trim().length() > 0 || name != null) {

			Staff staff = new Staff();
			staff.setName(name);
			staff.setGender(gender);

			System.out.println(conn != null ? "连接成功" : "连接失败");

		} else {

			System.out.println("客户传过来的参数有误!!!");

		}

	}

	public void init(ServletConfig config) throws ServletException {

		// 读spring-config.xml文件
	// 方法一：
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"tarena/web/spring-config.xml");

		DBBean db = (DBBean) context.getBean("db");
		String driver = db.getDriver();
		String url = db.getUrl();
		String user = db.getUser();
		String password = db.getPassword();

		conn = JdbcTemplate.getConnection(driver, url, user, password);
	}
}
