package command;

import main.Editor;

public class InsertCommand implements Command {
	
	private String[] wordsToAppend;
	
	public InsertCommand(String[] text) {
		this.wordsToAppend = text;
	}

	@Override
	public void execute(Editor editor) {
		for(String word: wordsToAppend) {
			editor.setText(editor.getText().append(word +" "));
		}
		
	}

}
