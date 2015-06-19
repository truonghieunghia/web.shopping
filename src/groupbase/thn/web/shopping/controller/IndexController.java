package groupbase.thn.web.shopping.controller;


import groupbase.thn.web.shopping.common.ControllerCommon;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;

@WebServlet(loadOnStartup = 1 ,urlPatterns = {"/index.html"})
@MultipartConfig
public class IndexController extends ControllerCommon{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet() {
		
		loadView("indexView");
		
		
	}

	@Override
	protected void doPost(){
		// TODO Auto-generated method stub
//		upload("/upload", "file", "test");
		/*MysqlConnect connect = new MysqlConnect();
		AccountType obj = new AccountType();
		obj.setAccountName("Admin");
		obj.setAccountTypeID(1);
		int result = -1;
		connect.open();
		ArrayList<ParameterSql> parameters = new ArrayList<ParameterSql>();
		parameters.add(new ParameterSql(Integer.class, 1));
//		result=connect.insert(AccountType.class, obj);
		result=connect.delete(AccountType.class, AccountType.AccountTypeID_Field +"=?", parameters);
		connect.close();
		System.out.println("no connect"+result);*/
		outString(outTextFromFile("/errorView.jsp"));
	}
	

}
