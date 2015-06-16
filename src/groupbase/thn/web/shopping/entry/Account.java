package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Account")
public class Account {

	@ColumnNameAnnotation(ColumnName="AccountID",FieldType=Integer.class)
	public int AccountID;
	public static String col_AccountID = "AccountID";
	@ColumnNameAnnotation(ColumnName="Email",FieldType=String.class)
	public String Email;
	public static String col_Email = "Email";
	@ColumnNameAnnotation(ColumnName="UserName",FieldType=String.class)
	public String UserName;
	public static String col_UserName = "UserName";
	@ColumnNameAnnotation(ColumnName="FristName",FieldType=String.class)
	public String FristName;
	public static String col_FristName = "FristName";
	@ColumnNameAnnotation(ColumnName="LastName",FieldType=String.class)
	public String LastName;
	public static String col_LastName = "LastName";
	@ColumnNameAnnotation(ColumnName="FullName",FieldType=String.class)
	public String FullName;
	public static String col_FullName = "FullName";
	@ColumnNameAnnotation(ColumnName="BirthDay",FieldType=String.class)
	public String BirthDay;
	public static String col_BirthDay = "BirthDay";
	@ColumnNameAnnotation(ColumnName="Address",FieldType=String.class)
	public String Address;
	public static String col_Address = "Address";
	@ColumnNameAnnotation(ColumnName="Tel",FieldType=Integer.class)
	public int Tel;
	public static String col_Tel = "Tel";
	@ColumnNameAnnotation(ColumnName="AccountTypeID",FieldType=Integer.class)
	public int AccountTypeID;
	public static String col_AccountTypeID = "AccountTypeID";
	@ColumnNameAnnotation(ColumnName="AccountName",FieldType=String.class)
	public String AccountName;
	public static String col_AccountName = "AccountName";
	@ColumnNameAnnotation(ColumnName="LocationID",FieldType=String.class)
	public String LocationID;
	public static String col_LocationID = "LocationID";
	@ColumnNameAnnotation(ColumnName="LocationName",FieldType=String.class)
	public String LocationName;
	public static String col_LocationName = "LocationName";
	@ColumnNameAnnotation(ColumnName="Image",FieldType=String.class)
	public String Image;
	public static String col_Image = "Image";

}
