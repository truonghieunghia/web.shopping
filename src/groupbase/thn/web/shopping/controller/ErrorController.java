package groupbase.thn.web.shopping.controller;
import javax.servlet.annotation.WebServlet;
import groupbase.thn.web.shopping.common.ControllerCommon;
@WebServlet(urlPatterns = {"/error.html"})
public class ErrorController extends ControllerCommon{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(){
		// TODO Auto-generated method stub
		loadView("errorView");
	}

	@Override
	protected void doPost(){
		// TODO Auto-generated method stub
		
	}

}
