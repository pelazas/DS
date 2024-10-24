package editor.core;

import editor.tool.SelectionTool;

public class Editor {

	private Drawing drawing;
	private Tool currentTool;
	
	public Editor() {
		this(new Drawing());
	}
	
	public Editor(Drawing drawing) {
		setDrawing(drawing);
	}

	public void draw() {
		drawing.draw();
		setTool(new SelectionTool(this));
	}
	
	//$ Drawing methods -----------------------------------
	
	public Drawing getDrawing() {
		return drawing;
	}
		
	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;
	}
		
    //$ UI methods ----------------------------------------

	public void setTool(Tool tool) {
		if(tool != null)
    		this.currentTool = tool;
	}

	public void mousePressed(int x, int y) {
		currentTool.mousePressed(x,y);
	}

	public void mouseMoved(int x, int y) {
		currentTool.mouseMoved(x,y);
	}

	public void mouseReleased() {
		currentTool.mouseReleased();
	}

	public Tool createSelectionTool() {
		return new SelectionTool(this);
	}
	
}
