package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Origin")
public class Origin {

	public static String OriginID_Field = "OriginID";
	public static String OriginName_Field = "OriginName";

	@ColumnNameAnnotation(ColumnName = "OriginID", FieldType = String.class)
	public String OriginID;
	@ColumnNameAnnotation(ColumnName = "OriginName", FieldType = String.class)
	public String OriginName;

}
