package fr.fms.entities;

public class TestCapitale {
	public static void main(String[] args) {
		Capitale paris = new Capitale("Paris", "France", 2000000, "Tour Eiffel");
		Capitale london = new Capitale("London", "GB", 1800000, "BigBen");
//		london.setMonument("Bridge");
//		paris.setPopulation(2200000);
		System.out.println(paris);
		System.out.println(london);
	}
	
}
