package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Categories")
public class Categories {

	@ColumnNameAnnotation(ColumnName="CategoriesID",FieldType=Integer.class)
	public int CategoriesID;
	public static String col_CategoriesID = "CategoriesID";
	@ColumnNameAnnotation(ColumnName="CategoriesName",FieldType=String.class)
	public String CategoriesName;
	public static String col_CategoriesName = "CategoriesName";

}
