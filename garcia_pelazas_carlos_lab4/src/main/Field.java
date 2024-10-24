package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Field {
	
	private String label;
	private Validator validator;
	private String value;
	
	public Field(String label, Validator validator) {
		this.label = label;
		this.validator = validator;
	}
	
	public void askUser() {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		boolean isValid;
		do {
			isValid = true;
			try {
				System.out.print(label + ": ");
				String value = console.readLine();

				if(validator.validate(value)) {
					this.value = value;
					return;
				}
				
				isValid = false;
				System.out.println("El valor introducido no es válido, vuelve a intentarlo");
				
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!isValid);
	}
	
	public String getValue() {
		return this.value;
	}
}
