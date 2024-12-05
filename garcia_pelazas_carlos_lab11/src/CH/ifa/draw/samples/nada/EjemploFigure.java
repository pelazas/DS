package CH.ifa.draw.samples.nada;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Vector;

import CH.ifa.draw.framework.Figure;
import CH.ifa.draw.standard.AbstractFigure;

public class EjemploFigure extends AbstractFigure {

	private static final long serialVersionUID = 1L;
	
	private Point origin;
	private Point corner;
	
	private int width;
	private int height;


	@Override
	protected void basicMoveBy(int dx, int dy) {
		
		this.origin.x = origin.x + dx;
		this.origin.y = origin.y + dy;
		
		this.corner.x = corner.x + dx;
		this.corner.y = corner.y + dy;
		
		calculateDimensions();

	}
	
	private void calculateDimensions() {
		width = this.corner.x-this.origin.x;
		height = this.corner.y - this.origin.y;
	}

	@Override
	public void basicDisplayBox(Point origin, Point corner) {
		this.origin = origin;
		this.corner = corner;
		
		calculateDimensions();
	}

	public void draw(Graphics g) {
		g.setColor(java.awt.Color.WHITE);
		g.fillRect(this.origin.x,this.origin.y,width, height);
		
		System.out.println("Origin: "+ origin.x +","+origin.y +" Corner: " + corner.x +","+corner.y);
	}	
	
	public Rectangle displayBox() {
		return new Rectangle(this.origin.x,this.origin.y,this.corner.x,this.corner.y);
	}
	
	public Vector handles() {
		return new Vector();
	}
	

}
