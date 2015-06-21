package groupbase.thn.web.shopping.controller;

import groupbase.thn.web.shopping.common.ControllerBase;
import groupbase.thn.web.shopping.model.RegisterAccountModel;

import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = {"/register.html","/Register.html"})
public class RegisterAccountController extends ControllerBase<RegisterAccountModel>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet() {
		// TODO Auto-generated method stub
		
		Model.defaultView();		
	}

	@Override
	protected void doPost() {
		// TODO Auto-generated method stub
		
	}

}
