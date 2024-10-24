package editor.action;

import editor.core.Editor;
import editor.core.Figure;

public class CreateAction implements Action {
	
	private Editor editor;
	private Figure figure;
	
	public CreateAction(Editor editor, Figure figure) {
		this.editor = editor;
		this.figure = figure;
	}

	@Override
	public void execute() {
		editor.drawing().addFigure(figure);

	}

	@Override
	public void undo() {
		editor.drawing().removeFigure(figure);
	}

}
