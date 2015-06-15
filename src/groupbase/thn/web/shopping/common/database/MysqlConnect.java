package groupbase.thn.web.shopping.common.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MysqlConnect {
	private Connection mConnection = null;
	private Statement mStatement = null;
	private ResultSet mResultSet = null;
	private ResultData mResultData = null;

	public void open() {
		try {
			InitialContext ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx
					.lookup("java:comp/env/jdbc/shopping");
			mConnection = dataSource.getConnection();
		} catch (NamingException e) {
			mConnection = null;
		} catch (SQLException e) {
			mConnection = null;
		}
	}

	public void close() {
		try {
			if (this.mConnection != null)
				this.mConnection.close();
			if (this.mResultSet != null)
				this.mResultSet.close();
			if (this.mStatement != null)
				this.mStatement.close();
		} catch (SQLException e) {
			this.mConnection = null;
			this.mResultSet = null;
			this.mStatement = null;
		}
	}

	public void executeQuery(String sql) {
		try {
			if (mConnection != null) {
				mStatement = mConnection.createStatement();
				mResultSet = mStatement.executeQuery(sql);
				mResultData = new ResultData(mResultSet);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ResultData getResultData() {
		return mResultData;
	}
}
