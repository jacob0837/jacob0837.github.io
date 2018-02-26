package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.web.struts.ActionSupport;

import com.biz.Adder;
import com.biz.IAdder;

public class AddAction extends ActionSupport {
	private IAdder add;
	public void setAdd(IAdder add) {
		this.add = add;
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		ApplicationContext context = this.getWebApplicationContext();
//		IAdder add = new Adder();
//		IAdder add = (IAdder)context.getBean("adder");
		double result = add.add(Double.parseDouble(a), Double.parseDouble(b));
		request.setAttribute("result", result);
		return mapping.findForward("index");
	}
	
}
