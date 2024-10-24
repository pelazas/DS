package editor.core;

import java.util.ArrayList;
import java.util.List;

public class Drawing  {
	
	private List<Figure> figures = new ArrayList<Figure>();
	
	public Drawing() {
		
	}
	
	public void addFigure(Figure figure) {
		figures.add(figure);
	}

	public void draw() {
		for(Figure f: figures) {
			f.draw();
		}
	}
	
	public Figure getFigure(int x, int y) {
		for(Figure f: figures) {
			if(f.containsPoint(x,y)) {
				return f;
			}
		}
		return null;
	}
}
