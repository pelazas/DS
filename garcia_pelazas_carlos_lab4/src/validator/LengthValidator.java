package validator;

import main.Validator;

public class LengthValidator implements Validator {
	
	private int length;
	
	public LengthValidator(int length) {
		this.length = length;
	}

	@Override
	public boolean validate(String input) {
		return input.length() == length;
	}

}
