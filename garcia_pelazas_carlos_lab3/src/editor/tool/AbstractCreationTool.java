package editor.tool;

import java.awt.Point;

import editor.core.Editor;
import editor.core.Figure;
import editor.core.Tool;

public abstract class AbstractCreationTool implements Tool{
	
	private Point start;
	private Point end;
	private Editor editor;
	
	public AbstractCreationTool(Editor editor) {
		this.editor = editor;
	}
	
	public void mousePressed(int x, int y) {
		this.start = new Point(x,y);
	}
	
	public void mouseMoved(int x, int y) {
		this.end = new Point(x,y);
	}

	public void mouseReleased() {
		Figure figure = createFigure(start, end);
		editor.getDrawing().addFigure(figure);
		editor.setTool(editor.createSelectionTool());
	}

	protected abstract Figure createFigure(Point start, Point end);
	

}
