package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "AccountType")
public class AccountType {

	public static String AccountTypeID_Field = "AccountTypeID";
	public static String AccountName_Field = "AccountName";

	@ColumnNameAnnotation(ColumnName = "AccountTypeID", FieldType = Integer.class)
	public int AccountTypeID;
	@ColumnNameAnnotation(ColumnName = "AccountName", FieldType = String.class)
	public String AccountName;

}
