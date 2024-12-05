package game.template;

import java.awt.Point;

import graphics.Image2D;

public abstract class BallGameTemplate {
	
	
	public void play() {
		
		Image2D image = loadImage("ball.png");

		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			drawBall(image, point);
		}
		
	}
	
	public abstract Image2D loadImage(String file);
	public abstract Point getPosition();
	public abstract void drawBall(Image2D image, Point point);
	
}
