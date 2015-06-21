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
	public static String FullName_Field = "FullName";
	public static String BirthDay_Field = "BirthDay";
	public static String Address_Field = "Address";
	public static String Tel_Field = "Tel";
	public static String AccountTypeID_Field = "AccountTypeID";
	public static String AccountName_Field = "AccountName";
	public static String LocationID_Field = "LocationID";
	public static String LocationName_Field = "LocationName";
	public static String Image_Field = "Image";
	public static String GenderID_Field = "GenderID";
	public static String GenderName_Field = "GenderName";
	public static String Password_Field = "Password";

	@ColumnNameAnnotation(ColumnName = "AccountID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	public int AccountID;

	@ColumnNameAnnotation(ColumnName = "Email", FieldType = String.class, MaxLength = 100)
	public String Email;

	@ColumnNameAnnotation(ColumnName = "UserName", FieldType = String.class, MaxLength = 100)
	public String UserName;

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

	@ColumnNameAnnotation(ColumnName = "GenderID", FieldType = Integer.class, MaxLength = 11)
	public int GenderID;

	@ColumnNameAnnotation(ColumnName = "GenderName", FieldType = String.class, MaxLength = 20)
	public String GenderName;

	@ColumnNameAnnotation(ColumnName = "Password", FieldType = String.class)
	public String Password;

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

	public int getGenderID() {
		return GenderID;
	}

	public void setGenderID(int genderID) {
		GenderID = genderID;
	}

	public String getGenderName() {
		return GenderName;
	}

	public void setGenderName(String genderName) {
		GenderName = genderName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
