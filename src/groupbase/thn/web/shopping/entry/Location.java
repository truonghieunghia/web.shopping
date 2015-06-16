package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Location")
public class Location {

	@ColumnNameAnnotation(ColumnName="LocationID",FieldType=String.class)
	public String LocationID;
	public static String col_LocationID = "LocationID";
	@ColumnNameAnnotation(ColumnName="LocationName",FieldType=String.class)
	public String LocationName;
	public static String col_LocationName = "LocationName";

}
