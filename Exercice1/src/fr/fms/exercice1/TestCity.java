package fr.fms.exercice1;

public class TestCity {

	public static void main(String[] args) {

		System.out.println("\n------------------ Exercice1.1 --------------------");
		/*
		 * City instantiations // 1 City toulouse = new City("Toulouse", "France",
		 * 450000); City milan = new City("Milan", "Italy", 850000); City madrid = new
		 * City("Madrid", "Spain", 450000);
		 * 
		 * // 2 City[] cities = { new City("Toulouse", "France", 450000), new
		 * City("Milan", "Italy", 850000), new City("Madrid", "Spain", 450000) };
		 * 
		 * Display cities attributes System.out.println("First way");
		 * toulouse.displayCity(); milan.displayCity(); madrid.displayCity();
		 * 
		 * System.out.println("\nSecond way"); for (int i = 0; i < cities.length; i++)
		 * cities[i].displayCity();
		 * 
		 * System.out.println("\nThird way");
		 * System.out.println(String.format("%-15s|%-15s|%-15s", "Name", "Country",
		 * "Population") + "\n" + String.format("%-15s|%-15s|%-15d", toulouse.name,
		 * toulouse.country, toulouse.population) + "\n" +
		 * String.format("%-15s|%-15s|%-15d", madrid.name, madrid.country,
		 * madrid.population) + "\n" + String.format("%-15s|%-15s|%-15d", milan.name,
		 * milan.country, milan.population));
		 * 
		 * Change toulouse (object) population attribute toulouse.population = 20000;
		 * System.out.println("\nThe new Toulouse Population :" + toulouse.population);
		 */

		System.out.println("\n------------------ Exercice1.2 --------------------");
		City toulouse = new City("Toulouse", "France", 450000);

		// Change toulouse (object) population attribute
		// toulouse.setPopulation(200);
		System.out.println("Name: " + toulouse.getName() + "\t" + "Country: " + toulouse.getCountry() + "\t"
				+ "Population: " + toulouse.getPopulation() + "\t\n");
		// ùSystem.out.println(toulouse.toString());

		/* User population number change */
		//toulouse.changePopulation();
		System.out.println(toulouse.getPopulation());

		System.out.println("\n------------------ Exercice1.3 --------------------");
		City rabat = new City("Rabat", 500000);
		rabat.displayCity();
		rabat.setCountry("Maroc");
		rabat.displayCity();
		
		System.out.println("\n------------------ Exercice1.4 --------------------");
		toulouse.display();
		
		System.out.println("\n------------------ Exercice1.5 --------------------");
		//que se passe t-il ici ? System.out.println(toulouse); Pourquoi ?
		//System.out.println(toulouse);
		
		//Réponse: fr.fms.exercice1.City@36d64342, 
		
		System.out.println("\n------------------ Exercice1.6 --------------------");
		System.out.println(toulouse);
		
		System.out.println("\n------------------ Exercice1.7 --------------------");
		City paris = new City("Paris","France",2000000);
		City nice = new City("Nice", "France", 340000);
		City lille = new City("Lille","France",250000);
		City pau = new City("Pau", "France", 300000);
		System.out.println("The total nober of objects instances is: "+paris.getInstanceNumber());
		
		System.out.println("\n------------------ Exercice1.8 --------------------");
	}

}
