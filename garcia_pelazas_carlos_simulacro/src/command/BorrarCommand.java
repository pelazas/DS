package command;

import main.Editor;

public class BorrarCommand implements Command {
	
	public BorrarCommand() {
		
	}

	@Override
	public void execute(Editor editor) {
		StringBuilder text = editor.getText();
		
		int indexOfLastWord = text.toString().trim().lastIndexOf(" ");
		if (indexOfLastWord == -1)
			text = new StringBuilder("");
		else
			text.setLength(indexOfLastWord + 1);
		
		editor.setText(text);

	}

}
