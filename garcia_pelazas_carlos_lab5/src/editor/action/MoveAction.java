package editor.action;

import editor.core.Figure;

public class MoveAction implements Action{
	
	private Figure figure;
	private int moveX;
	private int moveY;
	
	public MoveAction(Figure figure, int x, int y) {
		this.figure = figure;
		this.moveX = x;
		this.moveY = y;
	}

	@Override
	public void execute() {
		figure.moveBy(moveY, moveX);
		
	}

	@Override
	public void undo() {
		figure.moveBy(-moveY, -moveX);
		
	}

}
