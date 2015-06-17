package groupbase.thn.web.shopping.entry;

import java.io.Serializable;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "ProductsType")
public class ProductsType implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String ProductsTypeID_Field = "ProductsTypeID";
	public static String ProductsTypeName_Field = "ProductsTypeName";
	public static String CategoriesID_Field = "CategoriesID";

	@ColumnNameAnnotation(ColumnName = "ProductsTypeID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	public int ProductsTypeID;

	@ColumnNameAnnotation(ColumnName = "ProductsTypeName", FieldType = String.class, MaxLength = 100)
	public String ProductsTypeName;

	@ColumnNameAnnotation(ColumnName = "CategoriesID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	public int CategoriesID;

	public int getProductsTypeID() {
		return ProductsTypeID;
	}

	public void setProductsTypeID(int productsTypeID) {
		ProductsTypeID = productsTypeID;
	}

	public String getProductsTypeName() {
		return ProductsTypeName;
	}

	public void setProductsTypeName(String productsTypeName) {
		ProductsTypeName = productsTypeName;
	}

	public int getCategoriesID() {
		return CategoriesID;
	}

	public void setCategoriesID(int categoriesID) {
		CategoriesID = categoriesID;
	}

}
