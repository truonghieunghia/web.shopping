package groupbase.thn.web.shopping.model;

import groupbase.thn.web.shopping.common.ModelBase;
import groupbase.thn.web.shopping.common.database.MysqlConnect;
import groupbase.thn.web.shopping.entry.Gender;
import groupbase.thn.web.shopping.entry.Location;
import groupbase.thn.web.shopping.form.FormRegisterAccount;

import java.io.IOException;
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
		List<Gender> genders = sql.executeQueryEntry(Gender.class, null);
		sql.close();
		this.putData("gender_list", genders);
		this.putData("location_list", location);
		viewResult("registerAccountView");
	}
	public void addUser(){
		FormRegisterAccount form = this.getDataPost(FormRegisterAccount.class);
		if(form.username == null){			
			MysqlConnect sql = new MysqlConnect();
			sql.open();
			List<Location> location = sql.executeQueryEntry(Location.class, null);
			List<Gender> genders = sql.executeQueryEntry(Gender.class, null);
			sql.close();
			this.putData("gender_list", genders);
			this.putData("location_list", location);
			viewResult("registerAccountView");
		}
	}
}
