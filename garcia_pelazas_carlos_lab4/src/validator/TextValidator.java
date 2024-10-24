package validator;

import main.Validator;

public class TextValidator implements Validator {

	public TextValidator() {
	}

	@Override
	public boolean validate(String value) {
		for (char ch : value.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}


}
