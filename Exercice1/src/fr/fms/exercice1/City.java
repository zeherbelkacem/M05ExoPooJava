package fr.fms.exercice1;

import java.util.Scanner;


public class City {

	/*
	 * public String name; public String country; public int population;
	 */
	private String name;
	private String country;
	private int population;
	private static int instanceNumber;
	private Scanner scanner = new Scanner(System.in);

	//No Agrs Constructor
	public City() {
	}
	
	//2args constructor
	public City(String name, int population) {
		this.name = name;
		this.country = "unknown";
		this.population = population;
	}
	
	//All args constructor
	public City(String name, String country, int population) {
		if (population < 0) 
			throw new RuntimeException("Population number must be positive!");
		this.name = name;
		this.country = country;
		this.population = population;
		instanceNumber++;
	}
	
	public int getInstanceNumber() {
		return instanceNumber;
	}


	/*Getters & setter*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		if (population < 0) 
			throw new RuntimeException("Population number must be positive!");
			this.population = population;
	}
	
	/*Methods of class*/
	public void displayCity() { //Display city's attributs
		System.out.println("Name: "+this.name+"\t"
				+"Country: "+this.country+"\t"
				+"Population: "+this.population+"\t");
	}
	
	public void changePopulation() {
		System.out.println("Enter the new population number");
		int newPopilation = scanner.nextInt();
		setPopulation(newPopilation);
		scanner.close();
	}
	
	public void display() {
		System.out.println("ville de "+getName()+" en "+getCountry()+" ayant "+getPopulation()+" habitants");
	}
	
	@Override
	public String toString() {
		return "<< ville de "+ name+" en "+country+ " ayant "+population+" habitants >>";
	}
	
	

}
