package groupbase.thn.web.shopping.common;

import java.io.IOException;

import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.ParameterizedType;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Controller<M extends Model> extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public M Model;

	private void createModel(HttpServletRequest request,
			HttpServletResponse response) {
		@SuppressWarnings("unchecked")
		Class<M> obj = (Class<M>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
		try {
			Model = obj.getConstructor(HttpServlet.class,
					HttpServletRequest.class, HttpServletResponse.class)
					.newInstance(this,request, response);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		createModel(request, response);
		doGet();
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		createModel(request, response);
		doPost();
	}

	protected abstract void doGet();

	protected abstract void doPost();
}