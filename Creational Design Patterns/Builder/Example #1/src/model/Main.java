package model;

public class Main {

	public static void main(String[] args) {
		
		User petros = new User.UserBuilder("Petros", "Trak")
				.age(34)
				.address("Dodekanisou")
				.phoneNumber("555-6958")
				.builder();
		
		System.out.println(petros);
	}

}
