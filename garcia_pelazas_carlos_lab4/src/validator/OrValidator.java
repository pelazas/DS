package validator;

import main.Validator;

public class OrValidator implements Validator{
	
private Validator[] validators;
	
	public OrValidator(Validator...validators) {
		this.validators = validators;
	}

	@Override
	public boolean validate(String input) {
		for(Validator v: validators) {
			if(v.validate(input))
				return true;
		}
		return false;
	}

}
