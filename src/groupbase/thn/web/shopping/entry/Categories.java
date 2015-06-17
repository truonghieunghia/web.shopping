package groupbase.thn.web.shopping.entry;

import java.io.Serializable;

import groupbase.thn.web.shopping.common.database.ColumnNameAnnotation;
import groupbase.thn.web.shopping.common.database.EntryAnnotation;

@EntryAnnotation(TableName = "Categories")
public class Categories implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String CategoriesID_Field = "CategoriesID";
	public static String CategoriesName_Field = "CategoriesName";

	@ColumnNameAnnotation(ColumnName = "CategoriesID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	public int CategoriesID;

	@ColumnNameAnnotation(ColumnName = "CategoriesName", FieldType = String.class, MaxLength = 100)
	public String CategoriesName;

	public int getCategoriesID() {
		return CategoriesID;
	}

	public void setCategoriesID(int categoriesID) {
		CategoriesID = categoriesID;
	}

	public String getCategoriesName() {
		return CategoriesName;
	}

	public void setCategoriesName(String categoriesName) {
		CategoriesName = categoriesName;
	}

}
