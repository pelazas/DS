package command;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import main.Editor;

public class OpenCommand implements Command {
	
	private String filename;
	
	public OpenCommand(String filename) {
		this.filename = filename;
	}

	@Override
	public void execute(Editor editor) {
		
		String text = "";
		try {
			text = readFile(filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		editor.setText(new StringBuilder(text));
	}
	
	private String readFile(String filename) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(filename));
		String line;
		StringBuilder result = new StringBuilder();
		while ((line = input.readLine()) != null) {
			result.append(line);
		}
		input.close();
		return result.toString();
	}

}
