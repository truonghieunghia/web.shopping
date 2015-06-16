package groupbase.thn.web.shopping.entry;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "ProductsType")
public class ProductsType {

	@ColumnNameAnnotation(ColumnName="ProductsTypeID",FieldType=Integer.class)
	public int ProductsTypeID;
	public static String col_ProductsTypeID = "ProductsTypeID";
	@ColumnNameAnnotation(ColumnName="ProductsTypeName",FieldType=String.class)
	public String ProductsTypeName;
	public static String col_ProductsTypeName = "ProductsTypeName";
	@ColumnNameAnnotation(ColumnName="CategoriesID",FieldType=Integer.class)
	public int CategoriesID;
	public static String col_CategoriesID = "CategoriesID";

}
