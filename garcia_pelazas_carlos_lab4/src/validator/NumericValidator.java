package validator;

import main.Validator;

public class NumericValidator implements Validator {

	@Override
	public boolean validate(String input) {
		for (char ch : input.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
