package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Categories")
public class Categories {

	public static String CategoriesID_Field = "CategoriesID";
	public static String CategoriesName_Field = "CategoriesName";

	@ColumnNameAnnotation(ColumnName = "CategoriesID", FieldType = Integer.class)
	public int CategoriesID;
	@ColumnNameAnnotation(ColumnName = "CategoriesName", FieldType = String.class)
	public String CategoriesName;

}
