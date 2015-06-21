package groupbase.thn.web.shopping.entry;

import java.io.Serializable;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "AccountType")
public class AccountType implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String AccountTypeID_Field = "AccountTypeID";
	public static String AccountName_Field = "AccountName";

	@ColumnNameAnnotation(ColumnName = "AccountTypeID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	public int AccountTypeID;

	@ColumnNameAnnotation(ColumnName = "AccountName", FieldType = String.class, MaxLength = 100)
	public String AccountName;

	public int getAccountTypeID() {
		return AccountTypeID;
	}

	public void setAccountTypeID(int accountTypeID) {
		AccountTypeID = accountTypeID;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

}
