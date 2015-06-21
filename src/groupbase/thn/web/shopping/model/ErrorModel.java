package groupbase.thn.web.shopping.model;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import groupbase.thn.web.shopping.common.Model;

public class ErrorModel extends Model{

	public ErrorModel(HttpServlet httpServlet, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		super(httpServlet, request, response);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void defaultView() {
		// TODO Auto-generated method stub
		this.viewResult("errorView");
	}

}
