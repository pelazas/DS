package game.template;

import java.awt.Point;

import graphics.Image2D;
import platform.windows.WindowsAPI;

public class WindowsTemplate extends BallGameTemplate {

	private WindowsAPI windows = new WindowsAPI();

	@Override
	public Image2D loadImage(String file) {
		return windows.loadFile(file);
	}

	@Override
	public Point getPosition() {
		return windows.getMouseClick();
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		windows.paint(point.x, point.y, image);
	}

}
