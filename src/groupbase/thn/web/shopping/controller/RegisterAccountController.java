package groupbase.thn.web.shopping.controller;

import javax.servlet.annotation.WebServlet;

import groupbase.thn.web.shopping.common.ControllerCommon;
@WebServlet(urlPatterns = {"/register.html","/Register.html"})
public class RegisterAccountController extends ControllerCommon{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet() {
		// TODO Auto-generated method stub
		loadView("registerAccountView");
	}

	@Override
	protected void doPost() {
		// TODO Auto-generated method stub
		
	}

}
