package model;

public class Main {

	public static void main(String[] args) {
		
		User petros = new User.UserBuilder("Petros", "Trak")
				.age(34)
				.address("Dodekanisou 33")
				.phoneNumber("6942266075")
				.builder();
		
		System.out.println(petros);
	}

}
