package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UserInterface {
	
	private Editor editor;

	public UserInterface(Editor editor) {
		this.editor = editor;
	}
	
	public void run() {
		drawLogo();
		showHelp();

		do {
			System.out.print("> ");

			String userInput = askUser();

			if (userInput.equals("salir")) {
				System.out.println("¡Adiós!");
				return;
			}

			if (userInput.isBlank()) {
				continue;
			}

			String[] parts = userInput.split(" ");
			String option = parts[0];
			String[] params = Arrays.copyOfRange(parts, 1, parts.length);

			// No se comprueba que el número de parámetros sea correcto

			if (option.equals("abrir")) {
				String filename = params[0];
				editor.open(filename);
			} else if (option.equals("insertar")) {
				editor.insertar(params);
			} else if (option.equals("borrar")) {
				editor.borrar();
			} else if (option.equals("reemplazar")) {
				String find = params[0];
				String replace = params[1];
				editor.replace(find, replace);
			} else if (option.equals("grabar")) {
				editor.grabar(params[0]);
			} else if (option.equals("parar")) {
				editor.parar();
			} else if (option.equals("ejecutar")) {
				editor.ejecutarMacro(params[0]);
			} else if (option.equals("ayuda")) {
				showHelp();
			} else {
				System.out.println("Opción incorrecta");
			}

			System.out.println(editor.getText().toString());
			
		} while (true);
	}

	private static String askUser() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
			line = in.readLine();
		} catch (IOException e) {
			System.out.println("Error al leer la entrada del usuario");
			System.exit(1);
		}
		return line.trim();
	}

	private static void drawLogo() {
		System.out.println(LOGO);
	}

	private static void showHelp() {
		System.out.println(HELP);
	}

	private static final String LOGO = """
			███╗   ███╗ █████╗  ██████╗████████╗███████╗██╗  ██╗
			████╗ ████║██╔══██╗██╔════╝╚══██╔══╝██╔════╝╚██╗██╔╝
			██╔████╔██║███████║██║        ██║   █████╗   ╚███╔╝ 
			██║╚██╔╝██║██╔══██║██║        ██║   ██╔══╝   ██╔██╗ 
			██║ ╚═╝ ██║██║  ██║╚██████╗   ██║   ███████╗██╔╝ ██╗
			╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝   ╚═╝   ╚══════╝╚═╝  ╚═╝
			""";

	private static final String HELP = """
			┌──────────────────────┬───────────────────────────────────────────┐
			│ abrir <fichero>      │                                           │
			│ insertar <texto>     │ añade el texto al final                   │
			│ borrar               │ borra la última palabra                   │
			│ reemplazar <a> <b>   │ cambia <a> por <b> en todo el texto       │
			├──────────────────────┼───────────────────────────────────────────┤
			│ grabar <macro>       │ comienza la grabación de una macro        │
			│ parar                │ finaliza la grabación                     │
			│ ejecutar <macro>     │ ejecuta la macro cuyo nombre se indique   │
			├──────────────────────┼───────────────────────────────────────────┤
			│ ayuda                │                                           │
			│ salir                │                                           │
			└──────────────────────┴───────────────────────────────────────────┘
			""";

}
