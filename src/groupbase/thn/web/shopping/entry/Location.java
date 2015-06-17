package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Location")
public class Location {

	public static String LocationID_Field = "LocationID";
	public static String LocationName_Field = "LocationName";

	@ColumnNameAnnotation(ColumnName = "LocationID", FieldType = String.class)
	public String LocationID;
	@ColumnNameAnnotation(ColumnName = "LocationName", FieldType = String.class)
	public String LocationName;

}
