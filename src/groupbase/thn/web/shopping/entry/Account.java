package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;
@EntryAnnotation(TableName = "Account")
public class Account {

	@ColumnNameAnnotation(ColumnName="ACCOUNT_ID",FieldType=Integer.class)
	public int AccountID;
	@ColumnNameAnnotation(ColumnName="EMAIL",FieldType=String.class)
	public String Email;
	@ColumnNameAnnotation(ColumnName="USERNAME",FieldType=String.class)
	public String UserName;
	@ColumnNameAnnotation(ColumnName="FIRSTNAME",FieldType=String.class)
	public String FirstName;
	@ColumnNameAnnotation(ColumnName="LASTNAME",FieldType=String.class)
	public String LastName;
	@ColumnNameAnnotation(ColumnName="FULLNAME",FieldType=String.class)
	public String FullName;
	@ColumnNameAnnotation(ColumnName="BIRTHDAT",FieldType=String.class)
	public String BirthDay;
	@ColumnNameAnnotation(ColumnName="TEL",FieldType=Integer.class)
	public int Tel;
	@ColumnNameAnnotation(ColumnName="ADDRESS",FieldType=String.class)
	public String Address;
	@ColumnNameAnnotation(ColumnName="ACCOUNTTYPE",FieldType=Integer.class)
	public int AccountType;
	@ColumnNameAnnotation(ColumnName="ACCOUNTNAME",FieldType=String.class)
	public String AccountName;
	@ColumnNameAnnotation(ColumnName="LOCATIONID",FieldType=String.class)
	public String LocationID;
	@ColumnNameAnnotation(ColumnName="LOCATIONNAME",FieldType=String.class)
	public String LocationName;

	@Override
	public String toString() {
		return "Account [AccountID=" + AccountID + ", Email=" + Email
				+ ", UserName=" + UserName + ", FirstName=" + FirstName
				+ ", LastName=" + LastName + ", FullName=" + FullName
				+ ", BirthDay=" + BirthDay + ", Tel=" + Tel + ", Address="
				+ Address + ", AccountType=" + AccountType + ", AccountName="
				+ AccountName + ", LocationID=" + LocationID
				+ ", LocationName=" + LocationName + "]";
	}	
}
