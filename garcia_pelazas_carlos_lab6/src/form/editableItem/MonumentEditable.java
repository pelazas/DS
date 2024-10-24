package form.editableItem;

import model.Monument;

public class MonumentEditable implements EditableItem {
	
	private Monument monument;
	
	public MonumentEditable(Monument monument) {
		this.monument = monument;
	}

	@Override
	public String[] getFields() {
		return new String[] {"name", "author", "address"};
	}

	@Override
	public String getValue(String field) {
		switch(field) {
			case "name": return monument.getName();
			case "author": return monument.getAuthor();
			case "address": return monument.getAddress();
			default: return null;
		}
	}

	@Override
	public void setValue(String field, String value) {
		switch(field) {
			case "name": monument.setName(value);;
			case "author": monument.setAuthor(value);
			case "address": monument.setAddress(value);
		}

	}
	
	public String toString() {
		return "Name: " + monument.getName() +", Author: " + monument.getAuthor() +", Address: " + monument.getAddress();
	}

}
