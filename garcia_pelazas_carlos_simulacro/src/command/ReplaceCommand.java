package command;

import java.util.regex.Pattern;

import main.Editor;

public class ReplaceCommand implements Command {
	
	private String find;
	private String replace;
	
	public ReplaceCommand(String find, String replace) {
		this.find = find;
		this.replace = replace;
	}

	@Override
	public void execute(Editor editor) {
		StringBuilder text = editor.getText();
		
		text = new StringBuilder(text.toString().replaceAll(Pattern.quote(find), replace));

		editor.setText(text);
	}

}
