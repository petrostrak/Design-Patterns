package model;

import interfaces.HamburgerStore;

public class Main {

	public static void main(String[] args) {
		
		HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
		
		HamburgerStore jamaicanBurgerStore = new JamHamburgerStore();
		
		Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
		System.out.println("Peter ordered " + hamburger.getName());
		
		hamburger = jamaicanBurgerStore.orderHamburger("veggie");
		System.out.println("Maggie ordered an " + hamburger.getName());
	}

}
