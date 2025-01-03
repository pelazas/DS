package main;

import validator.*;

public class Main {

	public static void main(String[] args) {
		Form form = new Form();

		form.addField(new Field("Nombre", new TextValidator()));
		form.addField(new Field("Apellido", new TextValidator()));
		form.addField(new Field("Tel�fono", new NumericValidator()));
		form.addField(new Field("Ciudad", new PredefinedValidator("Santander", "Oviedo", "C�diz" )));
		
		form.addField(new Field("C�digo de producto", new LengthValidator(4)));
		form.addField(new Field("C�digo postal", new AndValidator(new NumericValidator(), new LengthValidator(5))));
		form.addField(new Field("Edad", new AndValidator(new NumericValidator(), new GreaterThanValidator(18))));
		form.addField(new Field("Ubicacion", new OrValidator(new PredefinedValidator("Santander", "Oviedo", "Cadiz"), new AndValidator(new NumericValidator(), new LengthValidator(5)))));
		form.addField(new Field("C�digo de promoci�n", new OrValidator(new TextValidator(),new AndValidator(new NumericValidator(), new LengthValidator(3)))));
		
		form.askUser();
	}
}
