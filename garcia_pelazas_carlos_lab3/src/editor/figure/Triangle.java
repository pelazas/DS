package editor.figure;

import java.awt.Point;

import editor.core.Figure;

public class Triangle implements Figure {
	
	private Point point1;
	private Point point2;
	private Point point3;
	
	public Triangle(Point point1, Point point2, Point point3) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	@Override
	public void draw() {
		System.out.println("Triangle: ("+this.point1.x+","+this.point1.y+") ("+this.point2.x+","+this.point2.y+") ("+this.point3.x+","+this.point3.y+")");

	}

	@Override
	public boolean containsPoint(int x, int y) {
		Point newPoint = new Point(x,y);
		return point1.equals(newPoint) || point2.equals(newPoint) || point3.equals(newPoint);
	}

	@Override
	public void move(int x, int y) {
		this.point1.x += x;
		this.point1.y += y;
		
		this.point2.x += x;
		this.point2.y += y;
		
		this.point3.x += x;
		this.point3.y += y;

	}

}
