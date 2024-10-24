package videoclub.movietype;

public class RegularMovie implements MovieType{

	@Override
	public double getPrice(int numberOfDays) {
		double result = 2;
		if (numberOfDays > 2)
			result += (numberOfDays - 2) * 1.5;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

}
