package editor.tool;

import java.awt.Point;

import editor.core.Editor;
import editor.core.Figure;
import editor.figure.Circle;

public class CircleCreationTool extends AbstractCreationTool{
	
	public CircleCreationTool(Editor editor) {
		super(editor);
	}

	@Override
	protected Figure createFigure(Point start, Point end) {
		double radius = Math.sqrt(Math.pow(end.x - start.x,2) + Math.pow(end.y - start.y, 2));
		return new Circle(start,radius);
	}

}
