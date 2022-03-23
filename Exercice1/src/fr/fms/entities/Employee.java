package fr.fms.entities;

import fr.fms.exercice1.City;
import fr.fms.exercice1.Person;

public class Employee extends Person {
	private String entreprise;
	private double salary;

	public Employee(String firstName, String lastName, int age, String address, City city, String entreprise,
			double salary) {
		super(firstName, lastName, age, address, city);
		this.entreprise = entreprise;
		this.salary = salary;
	}

	public Employee(String firstName, String lastName, int age, String address, City city, String entreprise) {
		super(firstName, lastName, age, address, city);
		this.entreprise = entreprise;
	}

	@Override
	public String toString() {
		if (salary <= 0)
			return super.toString() + ", entreprise:" + entreprise;
		return super.toString() + ", entreprise:" + entreprise + ", salary:" + salary;
	}

}
