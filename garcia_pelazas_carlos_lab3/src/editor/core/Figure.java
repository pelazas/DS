package editor.core;

public interface Figure {
	void draw();

	boolean containsPoint(int x, int y);

	void move(int x, int y);
}
