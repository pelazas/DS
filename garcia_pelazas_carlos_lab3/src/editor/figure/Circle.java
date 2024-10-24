package editor.figure;

import java.awt.Point;

import editor.core.Figure;

public class Circle implements Figure {
	
	private Point centralPoint;
	private double radius;
	
	public Circle(Point centralPoint, double radius) {
		this.centralPoint = centralPoint;
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circulo: ("+centralPoint.x+ "," + centralPoint.y + ")" +", radius: " + radius);

	}

	@Override
	public boolean containsPoint(int x, int y) {
        int distanceSquared = (x - centralPoint.x) * (x - centralPoint.x) + (y - centralPoint.y) * (y - centralPoint.y);
        return distanceSquared <= radius * radius;
	}

	@Override
	public void move(int x, int y) {
		this.centralPoint.x += x;
		this.centralPoint.y += y;
	}

}
