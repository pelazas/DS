package CH.ifa.draw.samples.nada;

import CH.ifa.draw.framework.DrawingView;
import CH.ifa.draw.framework.Figure;
import CH.ifa.draw.standard.CreationTool;

public class EjemploTool extends CreationTool {

	public EjemploTool(DrawingView view, Figure prototype) {
		super(view, prototype);
	}
	
	public EjemploTool(DrawingView view) {
		super(view);
	}
	
	protected Figure createFigure() {
        return new EjemploFigure();
    }

}
