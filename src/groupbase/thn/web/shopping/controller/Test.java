package groupbase.thn.web.shopping.controller;

import groupbase.thn.web.shopping.common.ControllerBase;
import groupbase.thn.web.shopping.model.TestModel;

import javax.servlet.annotation.WebServlet;

@WebServlet(loadOnStartup = 1, urlPatterns = { "/test.html" })
public class Test extends ControllerBase<TestModel> {

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
