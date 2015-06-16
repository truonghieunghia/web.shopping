package groupbase.thn.web.shopping.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public abstract class ControllerCommon extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RequestDispatcher mDispatcher;
	private String mPathView = "/";
	protected HttpServletRequest mRequest;
	protected HttpServletResponse mResponse;
	protected PrintWriter mPrintWriter;
	protected String mContentType = "text/html";

	public String getPathRoot() {
		return mRequest.getServletContext().getRealPath("");
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		this.mRequest = request;
		this.mResponse = response;
		this.mResponse.setContentType(mContentType);
		mPrintWriter = this.mResponse.getWriter();
		doGet();
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		this.mRequest = request;
		this.mResponse = response;
		this.mResponse.setContentType(mContentType);
		mPrintWriter = this.mResponse.getWriter();
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

	protected void setPathView(String pathView) {
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

	protected String getFileName(final Part part) {

		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename")) {
				return content.substring(content.indexOf('=') + 1).trim()
						.replace("\"", "");
			}
		}
		return null;
	}

	protected void upload(String pathFolder, String partName, String fileName) {
		try {
			final String path = getPathRoot() + pathFolder.trim();
			final Part filePart = mRequest.getPart(partName);
			final String tempfile = getFileName(filePart);
			if (fileName == null | fileName.trim().length() == 0) {
				fileName = tempfile;
			} else {

				fileName = fileName
						+ tempfile.substring(tempfile.lastIndexOf("."),
								tempfile.length());
			}
			OutputStream out = null;
			InputStream filecontent = null;
			out = new FileOutputStream(new File(path + File.separator
					+ fileName));
			filecontent = filePart.getInputStream();

			int read = 0;
			final byte[] bytes = new byte[1024];

			while ((read = filecontent.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}
			if (out != null) {
				out.close();
			}
			if (filecontent != null) {
				filecontent.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void outString(String text) {
		mPrintWriter.println(text);
	}

	protected <T> T getDataPost(Class<T> formData) {
		try {
			List<Field> fields = new ArrayList<Field>();
			fields.addAll(Arrays.asList(formData.getDeclaredFields()));
			Object result = formData.newInstance();

			for (Field field : fields) {
				field.setAccessible(true);
				FormAnnotation formAnnotation = field
						.getAnnotation(FormAnnotation.class);
				if (formAnnotation != null) {
					String[] value = mRequest.getParameterValues(formAnnotation
							.Name());
					if (value != null) {
						if (value.length == 1) {
							if (value[0].length() == 0) {
								field.set(result, null);
							} else {
								field.set(result, formAnnotation.FieldType()
										.cast(value[0]));
							}
						} else {
							field.set(result, value);
						}
					}
				} else {
					field.set(result, null);
				}
			}
			return formData.cast(result);
		} catch (Exception e) {
			return null;
		}
	}

	protected <T> T getQueryStringObject(Class<T> object) {
		return null;
	}

	protected abstract void doGet();

	protected abstract void doPost();
}
