package form.editableItem;

import model.Photo;

public class PhotoEditable implements EditableItem {
	
	private Photo photo;
	
	public PhotoEditable(Photo photo) {
		this.photo = photo;
	}

	@Override
	public String[] getFields() {
		return new String[] {"user", "description"};
	}

	@Override
	public String getValue(String field) {
		switch(field) {
			case "user": return photo.getUser();
			case "description": return photo.getDescription();
			default: return null;
		}
	}

	@Override
	public void setValue(String field, String value) {
		switch(field) {
			case "user": photo.setUser(value);
			case "description": photo.setDescription(value);
		}
	}

	public String toString() {
		return "User: " + photo.getUser() + ", Description: " + photo.getDescription();
	}
}
