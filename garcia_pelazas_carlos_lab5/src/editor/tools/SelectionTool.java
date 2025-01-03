package editor.tools;

import editor.action.MoveAction;
import editor.core.*;

public class SelectionTool implements Tool {

	private Drawing drawing;
	private Figure figure;
	private Point lastPosition;
	private Editor editor;

	public SelectionTool(Editor editor) {
		this.editor = editor;
		this.drawing = editor.drawing();
	}

	@Override
	public void reset() {
		figure = null;
		lastPosition = null;
	}

	@Override
	public void clickedOn(int x, int y) {
		figure = drawing.findFigureAt(x, y);
		if (figure != null)
			lastPosition = new Point(x, y);
	}

	@Override
	public void movedTo(int x, int y) {
		move(x, y);
	}

	@Override
	public void releasedOn(int x, int y) {
		move(x, y);
		reset();
	}

	private void move(int x, int y) {
		if (!isDragging())
			return;

//		lastPosition = new Point(x,y);
		editor.getActionManager().doAction(new MoveAction(figure, x - lastPosition.x(), y - lastPosition.y()));
//		figure.moveBy(x - lastPosition.x(), y - lastPosition.y());
		
		lastPosition = new Point(x, y);
	}

	private boolean isDragging() {
		return figure != null;
	}
}
