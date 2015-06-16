package groupbase.thn.web.shopping;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class GeneralEntry {

	public static void main(String[] args) throws Exception {
		Connection connect = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<String> listTable = new ArrayList<String>();
		HashMap<String, Object> tabledetail = new HashMap<String, Object>();
		String showtable = "show tables from shopping";
		String showcolumn = "SHOW COLUMNS FROM ";
		// TODO Auto-generated method stub
		String Path = System.getProperty("user.dir")
				+ "/src/groupbase/thn/web/shopping/entry/";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost/shopping?"
							+ "user=root&password=");
			statement = connect.createStatement();
			resultSet = statement.executeQuery(showtable);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("Tables_in_shopping"));
				listTable.add(resultSet.getString("Tables_in_shopping"));
			}
			for (String table : listTable) {
				resultSet = statement.executeQuery(showcolumn + table);
				ArrayList<Object> listcolumn = new ArrayList<Object>();
				while (resultSet.next()) {
					HashMap<String, String> obj = new HashMap<String, String>();
					obj.put("Field", resultSet.getString("Field"));
					obj.put("Type", resultSet.getString("Type"));
					obj.put("Null", resultSet.getString("Null"));
					obj.put("Key", resultSet.getString("Key"));
					obj.put("Default", resultSet.getString("Default"));
					obj.put("Extra", resultSet.getString("Extra"));
					listcolumn.add(obj);
				}
				tabledetail.put(table, listcolumn);
			}
			resultSet.close();
			statement.close();
			connect.close();
			//
			for (String table : listTable) {
				PrintWriter writer = new PrintWriter(Path + table + ".java");
				writer.println("package groupbase.thn.web.shopping.entry;");
				writer.println();
				writer.println("import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;");
				writer.println("import groupbase.thn.web.shopping.common.database.EntryAnnotation;");
				writer.println();
				writer.println("@EntryAnnotation(TableName = \"" + table
						+ "\")");
				writer.println("public class " + table + " {");
				writer.println();
				@SuppressWarnings("unchecked")
				ArrayList<Object> listcolumn = (ArrayList<Object>) tabledetail
						.get(table);
				for (Object obj : listcolumn) {
					@SuppressWarnings("unchecked")
					HashMap<String, Object> columnDetail = (HashMap<String, Object>) obj;
					String Field = columnDetail.get("Field").toString();
					String Type = columnDetail.get("Type").toString();
					String type = "String";
					if (Type.contains("int")) {
						Type = "Integer.class";
						type = "int";
					}

					if (Type.contains("varchar") | Type.contains("tinytext")
							| Type.contains("text") | Type.contains("char")) {
						Type = "String.class";
						type = "String";
					}
					writer.println("\t@ColumnNameAnnotation(ColumnName=\""
							+ Field + "\",FieldType=" + Type + ")");
					writer.println("\tpublic "+type +" "+ Field + ";");
				}
				writer.println();
				writer.println("}");
				writer.close();
			}

			//
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

}
