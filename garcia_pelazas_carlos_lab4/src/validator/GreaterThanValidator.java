package validator;

import main.Validator;

public class GreaterThanValidator implements Validator {
	
	private int number;
	
	public GreaterThanValidator(int number) {
		this.number = number;
	}

	@Override
	public boolean validate(String input) {
		int inputNumber = Integer.parseInt(input);
		return inputNumber > number;
	}

}
