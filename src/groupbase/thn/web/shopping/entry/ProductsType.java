package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "ProductsType")
public class ProductsType {

	public static String ProductsTypeID_Field = "ProductsTypeID";
	public static String ProductsTypeName_Field = "ProductsTypeName";
	public static String CategoriesID_Field = "CategoriesID";

	@ColumnNameAnnotation(ColumnName = "ProductsTypeID", FieldType = Integer.class)
	public int ProductsTypeID;
	@ColumnNameAnnotation(ColumnName = "ProductsTypeName", FieldType = String.class)
	public String ProductsTypeName;
	@ColumnNameAnnotation(ColumnName = "CategoriesID", FieldType = Integer.class)
	public int CategoriesID;

}
