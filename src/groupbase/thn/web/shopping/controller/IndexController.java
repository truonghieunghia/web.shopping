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
		/*MysqlConnect connect = new MysqlConnect();
		connect.open();
		connect.executeQuery("select * from Account");
		connect.close();
		ResultData data = connect.getResultData();
		if (data != null){
			Account obj = data.getDataRow(0,Account.class);
			System.out.println(obj.toString());
		}else{			
			System.out.println("no connect");
		}*/
		
	}

	@Override
	protected void doPost(){
		// TODO Auto-generated method stub
		upload("/upload", "file", "test");
	}
	

}
