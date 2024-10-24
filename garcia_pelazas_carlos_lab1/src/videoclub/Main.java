package videoclub;

import videoclub.movietype.NewReleaseMovie;

public class Main {

	public static void main(String[] args) {
		Customer customer2 = new Customer("Sallie");
		Movie movie1 = new Movie("Star Wars", new NewReleaseMovie());
		Rental rental1 = new Rental(movie1, 3); // 3 day rental
		customer2.addRental(rental1);

		String statement = customer2.statement();
		System.out.println(statement);
	}

}
