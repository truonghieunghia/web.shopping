package groupbase.thn.web.shopping.common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class ControllerCommon extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RequestDispatcher mDispatcher;
	private String mPathView = "/";
	protected HttpServletRequest mRequest;
	protected HttpServletResponse mResponse;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.mRequest = request;
		this.mResponse = response;
		doGet();
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.mRequest = request;
		this.mResponse = response;
		doPost();
	}

	private String getPath() {
		ServletContext context = this.getServletContext();
		if (context.getInitParameter("View") == null) {
			return mPathView;
		}
		if (mPathView.length() == 1) {
			return context.getInitParameter("View");
		} else {
			return mPathView;
		}
	}
	protected void setPathView(String pathView){
		mPathView = pathView;
	}
	protected void loadView(String viewName) {
		mDispatcher = getServletContext().getRequestDispatcher(
				getPath() + viewName + ".jsp");
		try {
			mDispatcher.forward(mRequest, mResponse);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void Redirect(String url) throws ServletException, IOException {
		this.mResponse.sendRedirect(url);
	}

	protected abstract void doGet();

	protected abstract void doPost();
}
