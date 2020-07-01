package models;

public class Main {

	public static void main(String[] args) {
		
		//Composition
		Vehicle benz = new Car(new Make(), new Assemble());
		benz.manufacture();
		
		Vehicle bmwR45 = new Bike(new Make(), new Assemble());
		bmwR45.manufacture();
	}

}
