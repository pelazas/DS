package command;

import java.util.ArrayList;
import java.util.List;

import main.Editor;

public class Macro implements Command{
	
	private List<Command> listOfCommands = new ArrayList<Command>();
	
	public Macro() {
		
	}
	
	public void addCommand(Command c) {
		this.listOfCommands.add(c);
	}

	@Override
	public void execute(Editor editor) {
		for(Command c: listOfCommands) {
			c.execute(editor);
		}
		
	}

}
