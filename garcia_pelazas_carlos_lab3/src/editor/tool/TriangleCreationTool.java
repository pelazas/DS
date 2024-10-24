package editor.tool;

import java.awt.Point;

import editor.core.Editor;
import editor.core.Tool;
import editor.figure.Triangle;

public class TriangleCreationTool implements Tool {
	
	private Editor editor;
	private Point point1;
	private Point point2;
	private Point point3;
	
	public TriangleCreationTool(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void mousePressed(int x, int y) {
		if(point1 == null) 
			point1 = new Point(x,y);
		else if(point2 == null) 
			point2 = new Point(x,y);
		else if(point3 == null)
			point3 = new Point(x,y);

	}

	@Override
	public void mouseReleased() {
		this.editor.getDrawing().addFigure(new Triangle(point1,point2,point3));

	}

	@Override
	public void mouseMoved(int x, int y) {
		// do nothing

	}

}
