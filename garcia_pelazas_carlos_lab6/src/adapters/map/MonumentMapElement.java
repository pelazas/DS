package adapters.map;

import google.maps.Coordinates;
import google.maps.GPS;
import google.maps.MapElement;
import model.Monument;

public class MonumentMapElement implements MapElement {
	
	private Monument monument;
	private GPS gps = new GPS();
	
	public MonumentMapElement(Monument monument) {
		this.monument = monument;
	}

	@Override
	public String getTitle() {
		return monument.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return gps.getCoordinates(monument.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		StringBuilder st = new StringBuilder();
		st.append("<h1>"+ monument.getName() + "</h1>");
		st.append("<h2>Author: "+ monument.getAuthor() + "</h2>");
		st.append("<h3>Address: "+ monument.getAddress() + "</h3>");
		return st.toString();
	}

	@Override
	public void open() {
		gps.getDirectionsTo(monument.getAddress());

	}

}
