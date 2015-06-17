package groupbase.thn.web.shopping.entry;

import java.io.Serializable;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Account")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
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

	@ColumnNameAnnotation(ColumnName = "AccountID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	public int AccountID;

	@ColumnNameAnnotation(ColumnName = "Email", FieldType = String.class, MaxLength = 100)
	public String Email;

	@ColumnNameAnnotation(ColumnName = "UserName", FieldType = String.class, MaxLength = 100)
	public String UserName;

	@ColumnNameAnnotation(ColumnName = "FristName", FieldType = String.class, MaxLength = 45)
	public String FristName;

	@ColumnNameAnnotation(ColumnName = "LastName", FieldType = String.class, MaxLength = 45)
	public String LastName;

	@ColumnNameAnnotation(ColumnName = "FullName", FieldType = String.class, MaxLength = 45)
	public String FullName;

	@ColumnNameAnnotation(ColumnName = "BirthDay", FieldType = String.class, MaxLength = 10)
	public String BirthDay;

	@ColumnNameAnnotation(ColumnName = "Address", FieldType = String.class)
	public String Address;

	@ColumnNameAnnotation(ColumnName = "Tel", FieldType = Integer.class, MaxLength = 11)
	public int Tel;

	@ColumnNameAnnotation(ColumnName = "AccountTypeID", FieldType = Integer.class, MaxLength = 11)
	public int AccountTypeID;

	@ColumnNameAnnotation(ColumnName = "AccountName", FieldType = String.class, MaxLength = 10)
	public String AccountName;

	@ColumnNameAnnotation(ColumnName = "LocationID", FieldType = String.class, MaxLength = 10)
	public String LocationID;

	@ColumnNameAnnotation(ColumnName = "LocationName", FieldType = String.class, MaxLength = 100)
	public String LocationName;

	@ColumnNameAnnotation(ColumnName = "Image", FieldType = String.class, MaxLength = 200)
	public String Image;

	public int getAccountID() {
		return AccountID;
	}

	public void setAccountID(int accountID) {
		AccountID = accountID;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getFristName() {
		return FristName;
	}

	public void setFristName(String fristName) {
		FristName = fristName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getBirthDay() {
		return BirthDay;
	}

	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getTel() {
		return Tel;
	}

	public void setTel(int tel) {
		Tel = tel;
	}

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

	public String getLocationID() {
		return LocationID;
	}

	public void setLocationID(String locationID) {
		LocationID = locationID;
	}

	public String getLocationName() {
		return LocationName;
	}

	public void setLocationName(String locationName) {
		LocationName = locationName;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

}
