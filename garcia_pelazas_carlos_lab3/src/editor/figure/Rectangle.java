package editor.figure;

import java.awt.Point;

import editor.core.Figure;

public class Rectangle implements Figure {
	
	Point initialPoint;
	Point finalPoint;

	public Rectangle(Point initialPoint, Point finalPoint) {
		this.initialPoint = initialPoint;
		this.finalPoint = finalPoint;
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangulo: ("+initialPoint.x +","+initialPoint.y+"), ancho = "+ (finalPoint.x - initialPoint.x) +", alto = "+(finalPoint.y - initialPoint.y));
		
	}

	@Override
	public boolean containsPoint(int x, int y) {
		// Ensure that initialPoint is the bottom-left and finalPoint is the top-right
	    int left = Math.min(initialPoint.x, finalPoint.x);
	    int right = Math.max(initialPoint.x, finalPoint.x);
	    int bottom = Math.min(initialPoint.y, finalPoint.y);
	    int top = Math.max(initialPoint.y, finalPoint.y);

	    return x >= left && x <= right && y >= bottom && y <= top;
	}

	@Override
	public void move(int x, int y) {
		this.initialPoint.x += x;
		this.initialPoint.y += y;
		
		this.finalPoint.x += x;
		this.finalPoint.y += y;
	}

}
