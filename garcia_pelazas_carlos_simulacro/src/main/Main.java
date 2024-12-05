package main;

public class Main {
	
	public static void main(String[] args) {
		
		Editor editor = new Editor();
		UserInterface ui = new UserInterface(editor);
		ui.run();
		
	}

	
}