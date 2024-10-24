package validator;

import main.Validator;

public class PredefinedValidator implements Validator {

	private String[] predefinedValues;

	public PredefinedValidator(String... prefefinedValues) {
		this.predefinedValues = prefefinedValues;
	}

	@Override
	public boolean validate(String input) {
		for (String each : predefinedValues) {
			if (input.equalsIgnoreCase(each)) {
				return true;
			}
		}
		return false;
	}

}
