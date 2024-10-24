package videoclub;

// Represents a rental of a movie by a customer.
public class Rental  {
	
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public double getPrice() {
		return movie.getPrice(daysRented);
	}

	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(daysRented);
	}
}
