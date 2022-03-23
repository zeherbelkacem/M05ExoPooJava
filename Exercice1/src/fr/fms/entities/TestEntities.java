package fr.fms.entities;

import fr.fms.exercice1.City;
import fr.fms.exercice1.Person;

public class TestEntities {

	public static void main(String[] args) {

		System.out.println("\n-----------------------------Exercice 3.6------------------------------------");
		Person[] persons = {
				new Employee("GATES", "Bill", 65, "aux USA", new City("Washington", "USA", 1500000), "Microsof",
						1500000),
				new Employee("MUSK", "Elon", 45, "à Palo Alto", new City("Pretoria", "South Africa", 800000), "Tesla",
						4500000), new Commerciale("DUPONT", "Remy", 28, "de la rue de rsiers à Toulouse",
						new City("Limoges", "France", 250000), "FMS-EA", 0.5) };

		for (int i = 0; i < persons.length; i++)
			System.out.println(persons[i]);

		System.out.println("\n-----------------------------Exercice 3.7------------------------------------");
		for (int i = 0; i < persons.length; i++)
			System.out.println("Salaire mensuel de "+persons[i].getLastName()+" "+persons[i].getFirstName()+": "+persons[i].renumeration());
	}

}
