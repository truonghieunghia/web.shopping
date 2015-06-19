package groupbase.thn.web.shopping.entry;

import java.io.Serializable;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Origin")
public class Origin implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String OriginID_Field = "OriginID";
	public static String OriginName_Field = "OriginName";

	@ColumnNameAnnotation(ColumnName = "OriginID", FieldType = String.class, isPrimary = true, MaxLength = 2)
	public String OriginID;

	@ColumnNameAnnotation(ColumnName = "OriginName", FieldType = String.class, MaxLength = 100)
	public String OriginName;

}
