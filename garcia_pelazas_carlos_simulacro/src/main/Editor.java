package main;

import java.util.*;

import command.*;

public class Editor {

	private StringBuilder text = new StringBuilder("");
	
	private Macro currentMacro;
	private Map<String, Macro> map = new HashMap<String, Macro>();
	
	public Editor() {
		
	}
	
	private void execute(Command command) {
		command.execute(this);
		if(currentMacro != null) {
			currentMacro.addCommand(command);
		}
		
	}
	
	public StringBuilder getText() {
		return text;
	}
	
	public void setText(StringBuilder txt) {
		this.text = txt;
	}

	public void open(String filename) {
		execute(new OpenCommand(filename));
		
	}

	public void insertar(String[] params) {
		execute(new InsertCommand(params));
		
	}

	public void borrar() {
		execute(new BorrarCommand());
		
	}

	public void replace(String find, String replace) {
		execute(new ReplaceCommand(find,replace));
		
	}

	public void grabar(String string) {
		Macro m = new Macro();
		map.put(string, m);
		currentMacro = m;
		
	}

	public void parar() {
		currentMacro = null;
		
	}

	public void ejecutarMacro(String string) {
		Macro m = map.get(string);
		execute(m);
	}
	
	
}
