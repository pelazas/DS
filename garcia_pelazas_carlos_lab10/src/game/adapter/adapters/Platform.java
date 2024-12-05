package game.adapter.adapters;

import java.awt.Point;

import graphics.Image2D;

public interface Platform {

	Image2D loadImage(String string);

	Point getPosition();

	void drawBall(Image2D image, Point point);

}
