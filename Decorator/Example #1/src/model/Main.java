package model;

import interfaces.IceCream;

public class Main {

	public static void main(String[] args) {
		IceCream basicIceCream = new BasicIceCream();
		System.out.println("Basic icecream cost €" + basicIceCream.cost());
		
		// add vanilla icecream to the order
		IceCream vanilla = new VanillaIceCream(basicIceCream); // wraping vanilla
		System.out.println("Adding vanilla, total cost is €" + vanilla.cost());
		
		// add mint to the order
		IceCream mint = new MintIceCream(vanilla);
		System.out.println("Adding mint, to tal cost is €" + mint.cost());
	}

}
