package editor.action;

import java.util.EmptyStackException;
import java.util.Stack;

public class ActionManager {

	private Stack<Action> undoStack = new Stack<Action>();
	private Stack<Action> redoStack = new Stack<Action>();
	
	public ActionManager() {
		
	}
	
	public void doAction(Action action) {
		this.undoStack.add(action);
		action.execute();
	}
	
	public void undoAction() {
		Action actionToUndo = undoStack.pop();
		if(actionToUndo == null) {
			throw new EmptyStackException();
		}
		actionToUndo.undo();
		redoStack.add(actionToUndo);
	}
	
	public void redoAction() {
		Action actionToRedo = redoStack.pop();
		if(actionToRedo == null) {
			throw new EmptyStackException();
		}
		actionToRedo.execute();
		undoStack.add(actionToRedo);
	}
	
}
