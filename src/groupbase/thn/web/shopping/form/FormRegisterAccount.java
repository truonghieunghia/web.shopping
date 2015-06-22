package groupbase.thn.web.shopping.form;

import java.io.Serializable;

import groupbase.thn.web.shopping.common.FormAnnotation;

public class FormRegisterAccount implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@FormAnnotation(Name = "username", FieldType = String.class)
	public String username;
	@FormAnnotation(Name = "email", FieldType = String.class)
	public String email;
	@FormAnnotation(Name = "fullname", FieldType = String.class)
	public String fullname;
	@FormAnnotation(Name = "password", FieldType = String.class)
	public String password;
	@FormAnnotation(Name = "repassword", FieldType = String.class)
	public String repassword;
	@FormAnnotation(Name = "birthday", FieldType = String.class)
	public String birthday;
	@FormAnnotation(Name = "gender", FieldType = Integer.class)
	public int gender;
	@FormAnnotation(Name = "address", FieldType = String.class)
	public String address;
	@FormAnnotation(Name = "location", FieldType = Integer.class)
	public int location;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}

}
