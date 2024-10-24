package videoclub.movietype;

public interface MovieType {
	
	double getPrice(int daysRented);
	int getFrequentRenterPoints(int daysRented);

}
