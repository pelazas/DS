package model;

import google.maps.Coordinates;

public class Photo {

	public Photo(String description, String user, Coordinates coordinates) {
		this.description = description;
		this.user = user;
		this.coordinates = coordinates;
	}

	public String getDescription() {
		return description;
	}

	public String getUser() {
		return user;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void show() {
		System.out.printf("Abriendo la foto %s...\n",description);
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public void setUser(String user) {
		this.user = user;
	}



	private String description;
	
	// Información del usuario que ha subido la foto
	private String user;
	
	// Coordenadas donde está tomada la foto
	private Coordinates coordinates;
}
