package groupbase.thn.web.shopping.controller;
import javax.servlet.annotation.WebServlet;

import groupbase.thn.web.shopping.common.Controller;
import groupbase.thn.web.shopping.model.ErrorModel;
@WebServlet(urlPatterns = {"/error.html"})
public class ErrorController extends Controller<ErrorModel>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(){
		// TODO Auto-generated method stub
		Model.defaultView();
	}

	@Override
	protected void doPost(){
		// TODO Auto-generated method stub
		
	}

}
