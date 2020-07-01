package models;

import interfaces.Workshop;

public class Make implements Workshop {

	@Override
	public void make() {
		System.out.println("Making");
	}

}
