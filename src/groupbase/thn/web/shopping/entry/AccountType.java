package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "AccountType")
public class AccountType {

	@ColumnNameAnnotation(ColumnName="AccountTypeID",FieldType=Integer.class)
	public int AccountTypeID;
	public static String col_AccountTypeID = "AccountTypeID";
	@ColumnNameAnnotation(ColumnName="AccountName",FieldType=String.class)
	public String AccountName;
	public static String col_AccountName = "AccountName";

}
