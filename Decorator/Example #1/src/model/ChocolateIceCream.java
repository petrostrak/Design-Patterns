package model;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

	public ChocolateIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		System.out.println("Adding chocolate..");
		return 1.00 + super.cost();
	}
	
}
