package validator;

import main.Validator;

public class AndValidator implements Validator {
	
	private Validator[] validators;
	
	public AndValidator(Validator...validators) {
		this.validators = validators;
	}

	@Override
	public boolean validate(String input) {
		for(Validator v: validators) {
			if(!v.validate(input))
				return false;
		}
		return true;
	}

}
