package adapters.map;

import google.maps.Coordinates;
import google.maps.MapElement;
import model.Photo;

public class PhotoMapElement implements MapElement {
	
	private Photo photo;
	
	public PhotoMapElement(Photo photo){
		this.photo = photo;
	}

	@Override
	public String getTitle() {
		return photo.getDescription();
	}

	@Override
	public Coordinates getCoordinates() {
		return photo.getCoordinates();
	}

	@Override
	public String getHTMLInfo() {
		StringBuilder st = new StringBuilder();
		st.append("<h1>"+ photo.getDescription() +"</h1>");
		st.append("<h2>Author: "+ photo.getUser() +"</h2>");
		st.append("<h3>Coordinates: "+ photo.getCoordinates().toString() +"</h3>");
		return st.toString();
	}

	@Override
	public void open() {
		photo.show();

	}

}
