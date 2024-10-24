package adapters.map;

import google.maps.Coordinates;
import google.maps.GPS;
import google.maps.MapElement;
import model.Restaurant;

public class RestaurantMapElement implements MapElement {
	
	private Restaurant restaurant;
	private GPS gps = new GPS();
	
	public RestaurantMapElement(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String getTitle() {
		return restaurant.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return gps.getCoordinates(restaurant.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		StringBuilder st = new StringBuilder();
		st.append("<h1>"+ restaurant.getName() +"</h1>");
		st.append("<h2>Phone number: "+ restaurant.getPhone() +"</h2>");
		st.append("<h3>Address: "+ restaurant.getAddress() +"</h3>");
		return st.toString();
	}

	@Override
	public void open() {
		restaurant.call();

	}

}
