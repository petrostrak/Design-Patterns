package models;

import interfaces.Workshop;

public class Assemble implements Workshop {

	@Override
	public void make() {
		System.out.println("..also");
		System.out.println("Assembled");
	}

}
