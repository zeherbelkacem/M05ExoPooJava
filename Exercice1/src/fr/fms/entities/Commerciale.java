package fr.fms.entities;

import fr.fms.exercice1.City;
import fr.fms.exercice1.Person;

public class Commerciale extends Person {

	private double caPerCent;
	private String entreprise;

	public Commerciale(String firstName, String lastName, int age, String address, City city, String entreprise,
			double perCent) {
		super(firstName, lastName, age, address, city);
		if (perCent < 0)
			throw new RuntimeException("% of turnover must be positif");
		this.entreprise = entreprise;
		this.caPerCent = perCent;
	}

	@Override
	public String toString() {
		return super.toString() + ", Entreprise: " +entreprise+", %CA: " + caPerCent;
	}

	public double getCaPerCent() {
		return caPerCent;
	}

	public void setCaPerCent(double caPerCent) {
		if (caPerCent < 0)
			throw new RuntimeException("% of turnover must be positif");
		this.caPerCent = caPerCent;
	}

	@Override
	public double renumeration() {
		return this.caPerCent*500000/100;
	}

}
