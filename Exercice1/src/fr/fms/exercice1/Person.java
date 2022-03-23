package fr.fms.exercice1;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private City city;

	// 5 args constructor
	public Person(String firstName, String lastName, int age, String address, City city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.city = city;
	}

	// All args constructor
	public Person(String firstName, String lastName, int age, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}

	// 3 args constructor
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = "unknown";
	}

	// 2 args constructor
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = 0;
		this.address = "unknown";
	}

	// Setters & getters
	public String getFirstName() {
		return firstName;
	}

//	@Override
//	public String toString() {
//		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
//				+ "]";
//	}

	//question 1.9
//	@Override
//	public String toString() {
//		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
//				+ "] Born" + city;
//	}
	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	//question2.0
	@Override
	public String toString() {
		return firstName+", "+lastName+", "+age+" ans, habitant "+address+", "+ city;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
