package groupbase.thn.web.shopping.model;

import groupbase.thn.web.shopping.common.ModelBase;
import groupbase.thn.web.shopping.common.database.MysqlConnect;
import groupbase.thn.web.shopping.entry.Location;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAccountModel extends ModelBase {

	public RegisterAccountModel(HttpServlet httpServlet,HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		super(httpServlet,request, response);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void defaultView() {
		// TODO Auto-generated method stub
		MysqlConnect sql = new MysqlConnect();
		sql.open();
		List<Location> location = sql.executeQueryEntry(Location.class, null);
		sql.close();
		this.putData("location_list", location);
		viewResult("registerAccountView");
	}
}
