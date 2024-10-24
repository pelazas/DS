package videoclub;

import videoclub.movietype.MovieType;

public class Movie {
	
	private String title;
	private MovieType type;

	public Movie(String title, MovieType type) {
		this.title = title;
		this.type = type;
	}
	
	public MovieType getType() {
		return type;
	}

	public void setType(MovieType priceCode) {
		this.type = priceCode;
	}
	
	public String getTitle() {
		return title;
	}

	public double getPrice(int daysRented) {
		return type.getPrice(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return type.getFrequentRenterPoints(daysRented);
	}
}
