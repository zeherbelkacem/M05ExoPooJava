package fr.fms.exercice1;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {
	public static void main(String[] args) {

		System.out.println("\n------------------ Exercice1.8 --------------------");

//		Person manu = new Person("MACRON", "Emmanuel", 43, "Elysée");
//		Person poutine = new Person("POUTINE", "Vladimir", 70);
//		Person bide = new Person("BIDEN", "Joe");
//		
//		System.out.println(manu);
//		System.out.println(poutine);
//		System.out.println(bide);

		System.out.println("\n------------------ Exercice1.9 --------------------");
//		Person manu = new Person("MACRON", "Emmanuel", 43, "Elysée", new City("Amiens", "France"));
//		Person poutine = new Person("POUTINE", "Vladimir", 70);
//		Person bide = new Person("BIDEN", "Joe");

//		System.out.println(manu);
//		System.out.println(poutine);
//		System.out.println(bide);

		System.out.println("\n------------------ Exercice2.0 --------------------");
		List<Person> persons = new ArrayList<Person>();
//		persons.add(new Person("MACRON", "Emmanuel", 43, "Elysée à Paris", new City("Amiens", "France")));
//		persons.add(new Person("SARKOZY", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000)));
//		persons.add(new Person("JONHSON", "Boris", 56, "Downing Street, London", new City("New York", "USA")));
//		persons.add(new Person("DEPARDIEU", "Gerard", 72, "Moscow", new City("Chateaurous", "France")));
//		persons.add(new Person("GRAVITZ", "Lenny", 33, "Hotel particulier à Paris", new City("New York", "USA")));
//		persons.add(new Person("LAUWRENCE", "Jennifer", 23, "Lousville USA", new City("Indiana Hills", "USA")));

		for (int i = 0; i < persons.size(); i++)
			System.out.println(persons.get(i));

		// Select only persons who address and county are Paris and France
		System.out.println();
		for (int i = 0; i < persons.size(); i++)
			if (persons.get(i).getAddress().toLowerCase().contains("Paris".toLowerCase())
					|| persons.get(i).getCity().getCountry().equalsIgnoreCase("France"))
				System.out.println(persons.get(i));
	}

}
