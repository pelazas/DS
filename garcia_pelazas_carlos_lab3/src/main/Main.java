package main;

import java.io.*;

import editor.core.Drawing;
import editor.core.Editor;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Editor editor = new Editor(new Drawing());
		UserInterface ui = new UserInterface(editor);
		ui.run();
		
	}

	
}
