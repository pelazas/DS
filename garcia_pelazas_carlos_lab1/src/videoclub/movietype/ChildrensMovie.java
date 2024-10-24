package videoclub.movietype;

public class ChildrensMovie implements MovieType {

	@Override
	public double getPrice(int numberOfDays) {
		double result = 1.5;
		if (numberOfDays > 3)
			result += (numberOfDays - 3) * 1.5;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

}
