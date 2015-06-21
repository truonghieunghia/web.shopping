package groupbase.thn.web.shopping.entry;

import java.io.Serializable;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Location")
public class Location implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String LocationID_Field = "LocationID";
	public static String LocationName_Field = "LocationName";

	@ColumnNameAnnotation(ColumnName = "LocationID", FieldType = String.class, isPrimary = true, MaxLength = 10)
	public String LocationID;

	@ColumnNameAnnotation(ColumnName = "LocationName", FieldType = String.class, MaxLength = 100)
	public String LocationName;

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

}
