package editor.tool;

import java.awt.Point;

import editor.core.Editor;
import editor.core.Figure;
import editor.figure.Rectangle;

public class RectangleCreationTool extends AbstractCreationTool{
	
	public RectangleCreationTool(Editor editor) {
		super(editor);
	}

	@Override
	protected Figure createFigure(Point start, Point end) {
		return new Rectangle(start,end);
	}

}
