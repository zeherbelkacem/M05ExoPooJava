package fr.fms.entities;

import java.util.Scanner;

import fr.fms.exercice1.City;
import fr.fms.exercice1.Person;

public class TestEmployee {

	public static void main(String[] args) {

		/*
		 * Dans le même package, ajouter la classe Employé qui hérite de Personne tel
		 * qu'un Employé est une Personne avec comme particularité d'être dans une
		 * entreprise avec un salaire. Puis créer une classe Test dans votre main pour
		 * instancier des Employés, afficher les en ajoutant une méthode toString() !
		 * Faites en sorte qu’il y ai des employés ayant pour ville de naissance de type
		 * Capital ou City. :
		 * 
		 */
		System.out.println("\n-----------------------------Exercice 3.3------------------------------------");
		Employee gates = new Employee("GATES", "Bill", 65, "aux USA", new City("Washington", "USA", 1500000),
				"Microsof", 1500000);
		Employee musk = new Employee("MUSK", "Elon", 45, "à Palo Alto", new City("Pretoria", "South Africa", 800000),
				"Tesla", 4500000);
		System.out.println(gates);
		System.out.println(musk);

		/*
		 * Exercice 3.3 : Ajouter une classe Commerciale qui est une personne qui
		 * travaille pour une entreprise avec une rémunération sur la base d’un
		 * pourcentage du chiffre d’affaires par mois puis tester là !
		 */
		System.out.println("\n-----------------------------Exercice 3.3------------------------------------");
		Commerciale dupont = new Commerciale("DUPONT", "Remy", 28, "de la rue de rsiers à Toulouse",
				new City("Limoges", "France", 250000), "FMS-EA", 0.5);
		// Person dupont = new Commerciale("DUPONT", "Remy", 28, "de la rue de rsiers
		// à Toulouse", new City("Limoges", "France", 250000), "FMS-EA", 0.5);
		System.out.println(dupont);

		System.out.println("\n-----------------------------Exercice 3.4------------------------------------");
		/*
		 * Veiller à empêcher l’utilisateur de faire des mauvaises saisies (salaire ou
		 * remise négative par ex), dans ce cas, mettez des valeurs minimums par défaut
		 * que l’on pourra aisément modifier par la suite, tester pour vérifier si ça
		 * répond aux besoins.
		 */

		// dupont.setCaPerCent(-5);
		System.out.println(dupont);

		System.out.println("\n-----------------------------Exercice 3.4------------------------------------");
		/* Faites en sorte que la population d’une ville n’apparaisse plus dorénavant */
		System.out.println("population: " + musk.getCity().getPopulation());
	}
}
