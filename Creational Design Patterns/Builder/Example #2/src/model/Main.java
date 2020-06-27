package model;

import interfaces.Person;

public class Main {

	public static void main(String[] args) {
		Person oldPerson = new Person.Builder("Petros", "Trak")
				.phone("6942266075")
				.address("Dodekanisou")
				.age(34)
				.build();
		
		System.out.println(oldPerson);
	}

}
