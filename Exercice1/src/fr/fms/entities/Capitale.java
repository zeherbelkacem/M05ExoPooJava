package fr.fms.entities;

import fr.fms.exercice1.City;

public class Capitale extends City{
	private String monument;

	public Capitale() {
		super();
	}

	public Capitale(String name, String country, int population, String monument) {
		super(name, country, population);
		this.monument = monument;
	}

	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}

	@Override
	public String toString() {
		return super.toString() + ", monument:" + monument;
	}

	
}
