package fr.fms.entities;

import fr.fms.exercice1.City;

public class Commerciale extends Employee{

	private double caPerCent;
	public Commerciale(String firstName, String lastName, int age, String address, City city, String entreprise,
			double perCent) {
		super(firstName, lastName, age, address, city, entreprise);
		this.caPerCent = perCent;
	}
	@Override
	public String toString() {
		return super.toString()+ ", %CA: "+caPerCent;
	}
	
	

}
