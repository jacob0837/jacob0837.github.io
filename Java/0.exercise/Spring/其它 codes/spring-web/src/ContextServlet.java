import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


public class ContextServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
			HelloIf hello = (HelloIf)context.getBean("hello");
			String result = hello.sayHello("Eric");
			System.out.println(result);
	}

}
