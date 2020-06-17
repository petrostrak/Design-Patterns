package model;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

	public MintIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		System.out.println("Adding mint flavor..");
		return 0.80 + super.cost();
	}
	
}
