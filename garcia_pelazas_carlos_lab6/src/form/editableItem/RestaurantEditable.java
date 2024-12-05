package form.editableItem;

import model.Restaurant;

public class RestaurantEditable implements EditableItem {
	
	private Restaurant restaurant;
	
	public RestaurantEditable(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String[] getFields() {
		return new String[] {"name", "phone", "address"};
	}

	@Override
	public String getValue(String field) {
		switch(field) {
			case "name": return restaurant.getName();
			case "phone": return restaurant.getPhone();
			case "address": return restaurant.getAddress();
			default: return null;
		}
	}

	@Override
	public void setValue(String field, String value) {
		switch(field) {
			case "name": restaurant.setName(value);;
			case "phone": restaurant.setPhone(value);
			case "address": restaurant.setAddress(value);
		}
	}
	
	public String toString() {
		return "Name: " + restaurant.getName() +", Phone: " + restaurant.getPhone() + ", Address: " + restaurant.getAddress();
	}

}
