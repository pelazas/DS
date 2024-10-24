package form;

import java.io.*;

import model.Monument;

// Formulario b�sico para usar cuando se quieran pedir solo dos valores sobre algo.
//
public class Form {

	public void edit(Monument monument) {
		System.out.println("Editando el monumento...");

		System.out.println("Valores actuales:");
		printMonument(monument);

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print(" - Autor: ");
		String value = readLine();
		if (value.length() > 0)
			monument.setAuthor(value);

		System.out.print(" - Dirección: ");
		value = readLine();
		if (value.length() > 0)
			monument.setAddress(value);

		System.out.println("Valores finales:");
		printMonument(monument);
	}

	private void printMonument(Monument monument) {
		System.out.println(" - Autor: " + monument.getAuthor());
		System.out.println(" - Dirección: " + monument.getAddress());
	}

	private String readLine() {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				return console.readLine();
			} catch (IOException ex) {
				System.out.println("Error de lectura: inténtelo de nuevo");
			}
		} while (true);
	}
}
