package videoclub.movietype;

public class NewReleaseMovie implements MovieType {

	@Override
	public double getPrice(int numberOfDays) {
		return numberOfDays * 3;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		return 1;
	}

}
