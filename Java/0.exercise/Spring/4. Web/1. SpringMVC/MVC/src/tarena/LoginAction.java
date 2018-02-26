package tarena;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//SpringMVC的分控制器
public class LoginAction implements Controller {

	//转发页面，这里通过IOC注入 success_view=success.jsp
	private String success_view;
	private String fail_view;
	
	public void setSuccess_view(String success_view) {
		this.success_view = success_view;
		System.out.println("注入success_view");
	}

	public void setFail_view(String fail_view) {
		this.fail_view = fail_view;
		System.out.println("注入fail_view");
	}

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("fail");
		//取得用户填入的参数
		String username = request.getParameter("username");
		String userpassword = request.getParameter("userpassword");
		
		//当用户输入的参数非空
		if(username!=null && userpassword!=null){
			
			//调用JavaBean与模型层交互
			if("tarena".equals(username) && "admin".equals(userpassword)){
				//登录成功
				System.out.println("登录成功！");
				//success代表success.jsp页面
				mv = new ModelAndView ("success");
				
				//
				mv.addObject("username", username);
				
				//将信息邦定到HttpSession范围对象上
				request.getSession().setAttribute("MV", mv);
				
			}else{
				System.out.println("登录失败！");
				mv = new ModelAndView ("fail");
			}
		}
		return mv;
	}
}
