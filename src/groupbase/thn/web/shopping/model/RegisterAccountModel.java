package groupbase.thn.web.shopping.model;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import groupbase.thn.web.shopping.common.Model;

public class RegisterAccountModel extends Model {

	public RegisterAccountModel(HttpServlet httpServlet,HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		super(httpServlet,request, response);
		// TODO Auto-generated constructor stub
	}

	public void test() {
		System.out.println("Hello Model");
	}

	@Override
	public void defaultView() {
		// TODO Auto-generated method stub
		viewResult("registerAccountView");
	}
}
