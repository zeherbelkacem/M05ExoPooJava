package fr.fms.exercice1;

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
		Person manu = new Person("MACRON", "Emmanuel", 43, "Elysée", new City("Amiens", "France"));
		Person poutine = new Person("POUTINE", "Vladimir", 70);
		Person bide = new Person("BIDEN", "Joe");
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(bide);
	}
	
	
	
}
