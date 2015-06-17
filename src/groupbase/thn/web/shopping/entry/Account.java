package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Account")
public class Account {

	public static String AccountID_Field = "AccountID";
	public static String Email_Field = "Email";
	public static String UserName_Field = "UserName";
	public static String FristName_Field = "FristName";
	public static String LastName_Field = "LastName";
	public static String FullName_Field = "FullName";
	public static String BirthDay_Field = "BirthDay";
	public static String Address_Field = "Address";
	public static String Tel_Field = "Tel";
	public static String AccountTypeID_Field = "AccountTypeID";
	public static String AccountName_Field = "AccountName";
	public static String LocationID_Field = "LocationID";
	public static String LocationName_Field = "LocationName";
	public static String Image_Field = "Image";

	@ColumnNameAnnotation(ColumnName = "AccountID", FieldType = Integer.class)
	public int AccountID;
	@ColumnNameAnnotation(ColumnName = "Email", FieldType = String.class)
	public String Email;
	@ColumnNameAnnotation(ColumnName = "UserName", FieldType = String.class)
	public String UserName;
	@ColumnNameAnnotation(ColumnName = "FristName", FieldType = String.class)
	public String FristName;
	@ColumnNameAnnotation(ColumnName = "LastName", FieldType = String.class)
	public String LastName;
	@ColumnNameAnnotation(ColumnName = "FullName", FieldType = String.class)
	public String FullName;
	@ColumnNameAnnotation(ColumnName = "BirthDay", FieldType = String.class)
	public String BirthDay;
	@ColumnNameAnnotation(ColumnName = "Address", FieldType = String.class)
	public String Address;
	@ColumnNameAnnotation(ColumnName = "Tel", FieldType = Integer.class)
	public int Tel;
	@ColumnNameAnnotation(ColumnName = "AccountTypeID", FieldType = Integer.class)
	public int AccountTypeID;
	@ColumnNameAnnotation(ColumnName = "AccountName", FieldType = String.class)
	public String AccountName;
	@ColumnNameAnnotation(ColumnName = "LocationID", FieldType = String.class)
	public String LocationID;
	@ColumnNameAnnotation(ColumnName = "LocationName", FieldType = String.class)
	public String LocationName;
	@ColumnNameAnnotation(ColumnName = "Image", FieldType = String.class)
	public String Image;

}
