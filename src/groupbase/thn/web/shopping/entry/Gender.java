package groupbase.thn.web.shopping.entry;

import java.io.Serializable;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Gender")
public class Gender implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String GenderID_Field = "GenderID";
	public static String GenderName_Field = "GenderName";

	@ColumnNameAnnotation(ColumnName = "GenderID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	public int GenderID;

	@ColumnNameAnnotation(ColumnName = "GenderName", FieldType = String.class, MaxLength = 20)
	public String GenderName;

}
