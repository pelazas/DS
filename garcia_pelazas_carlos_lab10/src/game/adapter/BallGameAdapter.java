package game.adapter;

import java.awt.Point;

import game.adapter.adapters.Platform;
import graphics.Image2D;

public class BallGameAdapter {
	
	private Platform platform;
	
	public BallGameAdapter(Platform p) {
		this.platform = p;
	}
	
	public void play() {
		
		Image2D image = platform.loadImage("ball.png");

		for (int i = 0; i < 10; i++) {
			Point point = platform.getPosition();
			platform.drawBall(image, point);
		}
		
	}
	
}
