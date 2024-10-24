package validator;

import java.util.*;

import main.Field;

public class Form {
	
	private List<Field> fields = new ArrayList<>();

	public void addField(Field field) {
		fields.add(field);
	}

	public void askUser() {
		for (Field field : fields) {
			field.askUser();
			System.out.println(field.getValue());
		}
	}
}
