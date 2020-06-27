package model;

import interfaces.Person;

public class Main {

	public static void main(String[] args) {
		Person oldPerson = new Person.Builder("Petros", "Trak")
				.phone("555-9293")
				.address("Dodekanisou")
				.age(34)
				.build();
		
		System.out.println(oldPerson);
	}

}
