package groupbase.thn.web.shopping.common.database;

public class DataColumn {
	private String mColumnName;
	private Object mValue;

	public void setColumnName(String columnName) {
		this.mColumnName = columnName;
	}

	public String getColumnName() {
		return mColumnName;
	}

	public void setValue(Object value) {
		this.mValue = value;
	}

	public Object getValue() {
		return mValue;
	}
	public <T> T getValue(Class<T> object) {
		return  object.cast(mValue);
	}
}
