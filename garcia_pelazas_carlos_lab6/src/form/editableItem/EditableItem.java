package form.editableItem;

public interface EditableItem {
	String[] getFields();
    String getValue(String field);
    void setValue(String field, String value);
}
