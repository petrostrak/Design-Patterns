package model;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

	public VanillaIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		System.out.println("Adding vanilla flavor..");
		return 0.50 + super.cost();
	}
	
}
