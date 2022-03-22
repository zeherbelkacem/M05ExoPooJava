package fr.fms.exercice1;

public class City {
	public String name;
	public String country;
	public int population;

	public City() {
	}

	public City(String name, String country, int population) {
		this.name = name;
		this.country = country;
		this.population = population;
	}
	
	/*Display city's attributs*/
	public void displayCity() {
		System.out.println("Name: "+this.name+"\t"
				+"Country: "+this.country+"\t"
				+"Population: "+this.population+"\t");
	}

}
