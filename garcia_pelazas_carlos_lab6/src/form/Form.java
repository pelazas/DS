package form;

import java.io.*;

import form.editableItem.EditableItem;
import model.Monument;

// Formulario b·sico para usar cuando se quieran pedir solo dos valores sobre algo.
//
public class Form {

	public void edit(EditableItem item, String[] fieldsToEdit) {
		System.out.println("Editando el monumento...");

		System.out.println("Valores actuales:");
		System.out.println(item.toString());
		
		for(int i = 0; i< fieldsToEdit.length; i++) {
			System.out.println("Escribe el nuevo valor para: " + fieldsToEdit[i]);
			String value = readLine();
			if (value.length() > 0)
				item.setValue(fieldsToEdit[i], value);
		}

		System.out.println("Valores finales:");
		System.out.println(item.toString());
	}


	private String readLine() {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				return console.readLine();
			} catch (IOException ex) {
				System.out.println("Error de lectura: int√©ntelo de nuevo");
			}
		} while (true);
	}
}
