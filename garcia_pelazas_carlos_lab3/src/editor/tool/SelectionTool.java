package editor.tool;

import java.awt.Point;

import editor.core.Editor;
import editor.core.Figure;
import editor.core.Tool;

public class SelectionTool implements Tool{
	
	Figure selectedFigure;
	Editor editor;
	Point selectedPoint;
	
	public SelectionTool(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void mousePressed(int x, int y) {
		selectedPoint = new Point(x,y);

		this.selectedFigure = editor.getDrawing().getFigure(x, y);
	}
	
	@Override
	public void mouseMoved(int x, int y) {
		if(this.selectedFigure != null) {
			this.selectedFigure.move(x-selectedPoint.x, y-selectedPoint.y);
		}
		
	}

	@Override
	public void mouseReleased() {
		this.selectedFigure = null;
		
	}

	

}
