package fr.fms.exercice1;

public class TestCity {

	public static void main(String[] args) {

		System.out.println("\n------------------ Exercice1.1 --------------------");
		/* City instantiations */
		// 1
		City toulouse = new City("Toulouse", "France", 450000);
		City milan = new City("Milan", "Italy", 850000);
		City madrid = new City("Madrid", "Spain", 450000);

		// 2
		City[] cities = { new City("Toulouse", "France", 450000), new City("Milan", "Italy", 850000),
				new City("Madrid", "Spain", 450000) };

		/* Display cities attributes */
		System.out.println("First way");
		toulouse.displayCity();
		milan.displayCity();
		madrid.displayCity();

		System.out.println("\nSecond way");
		for (int i = 0; i < cities.length; i++)
			cities[i].displayCity();

		System.out.println("\nThird way");
		System.out.println(String.format("%-15s|%-15s|%-15s", "Name", "Country", "Population") + "\n"
				+ String.format("%-15s|%-15s|%-15d", toulouse.name, toulouse.country, toulouse.population) + "\n"
				+ String.format("%-15s|%-15s|%-15d", madrid.name, madrid.country, madrid.population) + "\n"
				+ String.format("%-15s|%-15s|%-15d", milan.name, milan.country, milan.population));

		/* Change toulouse (object) population attribute */
		toulouse.population = 20000;
		System.out.println("\nThe new Toulouse Population :" + toulouse.population);
	}

}
